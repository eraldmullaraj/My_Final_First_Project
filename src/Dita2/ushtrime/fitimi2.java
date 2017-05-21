package Dita2.ushtrime;

/**
 * Created by erald on 17-05-15.
 */
public class fitimi2 {

    double rrogaEPunes;
    double taksat;
    double shpenzimetEMakines;
    double shpenzimetEKafeve;

    public double gjejFitiminMujor(int m){
        return (rrogaEPunes - taksat - shpenzimetEMakines - shpenzimetEKafeve) * m;
    }

    public double gjejShpwnzimetMujore(int m){
        return m* (taksat+shpenzimetEKafeve+shpenzimetEMakines);
    }

    fitimi2(double a, double b, double c, double d){
        rrogaEPunes=a;
        taksat=b;
        shpenzimetEKafeve=c;
        shpenzimetEMakines=d;
    }

}
