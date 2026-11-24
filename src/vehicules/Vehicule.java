package vehicules;

public class Vehicule {

    private String immatriculation;
    private String marque;
    private String modele;
    private int kilometrage;
    private double tarifJournalier;
    private boolean disponible;

    private static int compteurVehicules;
    public static final String DEVISE = "EUR";

    public Vehicule() {
        immatriculation = "N/A";
        marque = "N/A";
        disponible = true;
        kilometrage = 0;
        tarifJournalier = 0.0;
        compteurVehicules++;
        System.out.println("Constructeur par défaut appelé");
    }

    public Vehicule(String immat, String marque, String modele, double tarif) {
        immatriculation = immat;
        this.marque = marque;
        this.modele = modele;
        tarifJournalier = tarif;
        compteurVehicules++;
        System.out.println("Constructeur d'initialisation appelé");
    }

    public Vehicule(Vehicule v) {
        immatriculation = v.immatriculation;
        marque = v.marque;
        modele = v.modele;
        tarifJournalier = v.tarifJournalier;
        kilometrage = v.kilometrage;
        disponible = v.disponible;
        compteurVehicules++;
        System.out.println("Constructeur de copie appelé");
    }

    public void rouler(int km) {
        kilometrage += km;
    }

    public void afficherInfos() {
        System.out.println("Vehicule{immatriculation='" + immatriculation + "', marque='" + marque + "', modele='" + modele + "', km=" + kilometrage + ", tarif=" + tarifJournalier + ", disponible=" + disponible + "}");
    }

    public String getImmatriculation() {return immatriculation;}
    public String getMarque() {return marque;}
    public String getModele() {return modele;}
    public int getKilometrage() {return kilometrage;}
    public double getTarifJournalier() {return tarifJournalier;}
    public boolean getDisponible() {return disponible;}
    public static int getCompteurVehicules() {return compteurVehicules;}

    public void setMarque(String marque) {this.marque = marque;}
    public void setModele(String modele) {this.modele = modele;}
    public void setDisponible(boolean dispo) {disponible = dispo;}
    public void setKilometrage(int km) {
        if (km >= 0) kilometrage = km;
        else System.out.println("Err: kilometrage négatif");
    }
    public void setTarifJournalier(double tarif) {
        if (tarif < 0) System.out.println("Err: tarif négatif");
        else tarifJournalier = tarif;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s - %d km - %.2f %s/jour - %s",
                immatriculation, marque, modele, kilometrage, tarifJournalier, DEVISE,
                disponible ? "DISPONIBLE" : "INDISPONIBLE");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicule autre = (Vehicule) obj;
        return this.immatriculation.equals(autre.immatriculation);
    }
}
