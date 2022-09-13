package com.xyzcomptemangagement;

import java.util.Date;

public class program {
    public static void main(String[] args) {
        /* Scenario
        *
         */
        Client client=new Client (11, "Ali", "Baba");
        Compte compte=new Compte(11,"4567123",client);
       // compte.setId(11);
       // compte.setNumero("A12345");
       // compte.setClient(client);
        client.setCompte(compte);
        Operation op1=new Operation(new Date(2020,3,5),"vers",4000 );
        compte.addOperation(op1);

        Operation op2=new Operation(new Date(2020,3,7),"vers",5000 );
        compte.addOperation(op2);

        compte.addOperation(new Operation(new Date(2020,3,25),"RETR",2000 ));

        compte.addOperation(new Operation(new Date(2020,3,30),"RETR",3000 ));


        compte.addOperation(new Operation(new Date(2020,4,5),"Vers",6000 ));
    }
}
