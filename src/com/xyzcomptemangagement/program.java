package com.xyzcomptemangagement;

import java.util.Date;

public class program {
   public static void afficherDetailCompte(Compte compte, Client client){

       System.out.println ("Client: "+client.getNom()+" "+client.getPrenom());
       System.out.println("Compte: "+compte.getNumero());
       System.out.println("Operation");
       System.out.println("Date Type Montant");
       for (Operation op: compte.getOperations()){
           System.out.println(op.getDate()+"^"+op.getType()+" "+op.getMontant());
       }

       System.out.println("Solde: "+compte.getSolde());

   }
    public static void main(String[] args) {
        /* Scenario
        *
         */

        //Construction du client et du compte.

        Client client=new Client (11, "Ali", "Baba");
        Compte compte=new Compte(11,"4567123",client);
        client.setCompte(compte);

        //Définition des opérations

        Operation op1=new Operation(new Date(2020,3,5),"Vers",4000 );
        compte.addOperation(op1);

        Operation op2=new Operation(new Date(2020,3,7),"Vers",5000 );
        compte.addOperation(op2);

        compte.addOperation(new Operation(new Date(2020,3,25),"RETR",2000 ));

        compte.addOperation(new Operation(new Date(2020,3,30),"RETR",3000 ));

        compte.addOperation(new Operation(new Date(2020,4,5),"Vers",6000 ));

        // Affichage des operations du client
        afficherDetailCompte(compte,client);


    }

}
