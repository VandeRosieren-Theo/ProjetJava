package clients;

public class Client {

    protected String nom;
    protected String prenom;
    protected String numeroPermis;
    protected String telephone;
    protected int anneeNaissance;



    public Client(){

        System.out.println("Constructeur par défaut");
        nom = "N/A";
        prenom = "N/A";
        numeroPermis = "N/A";
        telephone = "N/A";
        anneeNaissance = 2000;


    }


    public Client (String nom, String prenom, String numeroPermis, String telephone, int anneeNaissance){

        System.out.println("Constructeur par d'initilisation");
        this.nom=nom;
        this.prenom=prenom;
        this.numeroPermis=numeroPermis;
        this.telephone=telephone;
        this.anneeNaissance=anneeNaissance;
    }

    public Client( Client c){


        System.out.println("Constructeur de copie");
        this.nom=c.nom;
        this.prenom=c.prenom;
        this.numeroPermis=c.numeroPermis;
        this.telephone=c.telephone;
        this.anneeNaissance=c.anneeNaissance;
    }

    public int calculerAge(int anneeCourante){

        return anneeCourante-anneeNaissance;
    }

    public void afficherInfos(){
        System.out.println("nom = " + this.nom + ", nom = " + this.prenom + ", numeroPermis = " + numeroPermis + ", telephone = " + telephone + ", annee naissance = " + anneeNaissance + ", age =" + calculerAge(anneeNaissance));
    }


}
