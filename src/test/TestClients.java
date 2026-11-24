package test;

import clients.Client;

public class TestClients {
    public static void main(String[] args){

    Client client = new Client("N/A", "N/A", "N/A", "N/A", 2000 );

    client.afficherInfos();

    Client c = new Client( client );

    c.afficherInfos();




    }

}
