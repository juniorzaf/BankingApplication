package com.xyzcomptemangagement;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Compte {
    private int id;
    private String numero;
    private double solde;
    /* La rélation qui contient une seule réference*/

    private Client client; /* On appelle cela la Navigation de references*/
    /* définir la rélation qui contient plusieurs réferences: collection*/

    /*Collection-Interfaces*/
    private List <Operation> operations=new ArrayList<Operation>();



    /* Les Constructeurs */
    public Compte () {
        solde=0;
    }

    public Compte (int id, String numero, Client client){
        this.id=id;
        this.numero=numero;
        this.solde=0;
        this.client=client;
    }

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public Client getClient() {
        return client;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public void addOperation (Operation operation){
      operations.add(operation);
      if (operation.getType().equals("Vers"))
          solde=solde+operation.getMontant();
        if (operation.getType().equals("RETR"))
            solde=solde-operation.getMontant();
    }
}

