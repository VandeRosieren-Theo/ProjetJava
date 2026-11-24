package test;

import vehicules.Vehicule;

public class TestVehicules {
    public static void main(String[] args) {
        Vehicule v1 = new Vehicule();
        v1.afficherInfos();
        Vehicule v2 = new Vehicule("imm", "mr", "md", 1.0);
        v2.afficherInfos();
        Vehicule v3 = new Vehicule(v1);
        v3.afficherInfos();
        v1.rouler(250);
        System.out.println("Après 250km:");
        v1.afficherInfos();
    }
}
