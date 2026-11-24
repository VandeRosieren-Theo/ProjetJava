package clients;

public class Entreprise extends Client{

    private String RaisonSociale;
    private String Siret;


    public Entreprise (){
        super();
        RaisonSociale="N/A";
        Siret="N/A";

    }

    public String getRaisonSociale(){
        return RaisonSociale;
    }

    public void setRaisonSociale(String RaisonSociale){
        this.RaisonSociale=RaisonSociale;
    }

    public String getSiret(){
        return Siret;
    }

    public void setSiret(String Siret){
        this.Siret = Siret;
    }




    public double calculerRemise(){
        return 0.10;
    }
}
