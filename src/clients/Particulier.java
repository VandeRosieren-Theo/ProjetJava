package clients;

public class Particulier extends Client {

   private boolean EstAssurePlusUnAn;

   public Particulier (){
       super();
       EstAssurePlusUnAn = true;
   }




    public boolean getEstAssurePlusUnAn(){
        return EstAssurePlusUnAn;
    }

    public void setEstAssurePlusUnAn(boolean EstAssurePlusUnAn){
       this.EstAssurePlusUnAn = EstAssurePlusUnAn;
    }



    @Override
    public double calculerRemise(){
        return 0.05;
    }
}
