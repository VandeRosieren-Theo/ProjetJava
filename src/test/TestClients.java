package test;

import clients.Client;

public class TestClients {
    public static void main(String[] args){

    Client c1 = new Client("N/A", "N/A", "N/A", "N/A", 2000 );

    c1.afficherInfos();

    Client c2 = new Client( c1 );

    c2.afficherInfos();


    System.out.println("\nÉgalité (numeroPermis)");
    System.out.println("c1 == c2 ? " + (c1 == c2));
    System.out.println("c1.equals(c2) ? " + c1.equals(c2));


    System.out.println("\n hashCode()");
    System.out.println("c1.hashCode() == c2.hashCode() ? " + (c1.hashCode() == c2.hashCode()));


    System.out.println("\n Compteur ");
    System.out.println("Total clients créés : " + Client.getCompteurClients());
    }

}
