package vehicules;

public class Vehicule {

    private String immatriculation;
    private String marque;
    private String modele;
    private int kilometrage;
    private double tarifJournalier;
    private boolean disponible;

    public Vehicule() {
        immatriculation = "N/A";
        marque = "N/A";
        disponible = true;
        kilometrage = 0;
        tarifJournalier = 0.0;
        System.out.println("Constructeur par défaut appelé");
    }

    public Vehicule(String immat, String marque, String modele, double tarif) {
        immatriculation = immat;
        this.marque = marque;
        this.modele = modele;
        tarifJournalier = tarif;
        System.out.println("Constructeur d'initialisation appelé");
    }

    public Vehicule(Vehicule v) {
        immatriculation = v.immatriculation;
        marque = v.marque;
        modele = v.modele;
        tarifJournalier = v.tarifJournalier;
        kilometrage = v.kilometrage;
        disponible = v.disponible;
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
}
