package Dita2.ushtrime;

/**
 * Created by erald on 17-04-30.
 */
public class fitimi {

    double rrogaEPunes;
    public double getRrogaEPunes(){
        return rrogaEPunes;
    }    public void setRrogaEPunes(double rrogaEPunes){
        this.rrogaEPunes = rrogaEPunes;
    }

    double taksat;
    public double getTaksat(){
        return taksat;
    }    public void setTaksat(double taksat){
        this.taksat = taksat;
    }


    double shpenzimetEKafeve;
    public double getShpenzimetEKafeve(){
        return shpenzimetEKafeve;
    }    public void setShpenzimetEKafeve(double shpenzimetEKafeve){
        this.shpenzimetEKafeve = shpenzimetEKafeve;
    }

    double shpenzimetEMakines;
    public double getShpenzimetEMakines(){
        return shpenzimetEMakines;
    }    public void setShpenzimetEMakines(double shpenzimetEMakines){
        this.shpenzimetEMakines = shpenzimetEMakines;
    }


    public double llogaritFitimin (){
        return (getRrogaEPunes() - getTaksat() - getShpenzimetEKafeve() - getShpenzimetEMakines());
    }
    public double llogaritFitiminVjetor (){
        return 12*llogaritFitimin();
    }


}
