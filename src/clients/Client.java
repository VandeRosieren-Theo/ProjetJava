package clients;

import java.util.Objects;

public class Client {

    private String nom;
    private String prenom;
    private String numeroPermis;
    private String telephone;
    private int anneeNaissance;
    private static int compteurClients;
    public static final String DEVISE = "EUR";



    public Client(){

        System.out.println("Constructeur par défaut");
        nom = "N/A";
        prenom = "N/A";
        numeroPermis = "N/A";
        telephone = "N/A";
        anneeNaissance = 2000;
        compteurClients++;

    }


    public Client (String nom, String prenom, String numeroPermis, String telephone, int anneeNaissance){

        System.out.println("Constructeur par d'initilisation");
        this.nom=nom;
        this.prenom=prenom;
        this.numeroPermis=numeroPermis;
        this.telephone=telephone;
        this.anneeNaissance=anneeNaissance;
        compteurClients++;
    }

    public Client( Client c){


        System.out.println("Constructeur de copie,");
        this.nom=c.nom;
        this.prenom=c.prenom;
        this.numeroPermis=c.numeroPermis;
        this.telephone=c.telephone;
        this.anneeNaissance=c.anneeNaissance;
        compteurClients++;
    }

    public int calculerAge(int anneeCourante){

        return anneeCourante-anneeNaissance;
    }

    public void afficherInfos(){
        System.out.println("nom = " + this.nom + ", nom = " + this.prenom + ", numeroPermis = " + numeroPermis + ", telephone = " + telephone + ", annee naissance = " + anneeNaissance + ", age =" + calculerAge(2026));
    }


    public String getNom(){ return nom;}
    public String getPrenom(){return prenom;}
    public String getTelephone(){return telephone;}
    public String getNumeroPermis(){return numeroPermis;}
    public int getAnneeNaissance(){return anneeNaissance;}
    public static int getCompteurClients(){return compteurClients;}


    public void setNom(String nom){
        this.nom=nom;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if (o==null) return false;
        Client autre = (Client) o;
        return this.numeroPermis.equals(autre.numeroPermis);
    }


    @Override
    public int hashCode() {
        return Objects.hash(numeroPermis);
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s (%d) - Tél : %s",
                numeroPermis, prenom, nom, anneeNaissance, telephone);
    }
}
