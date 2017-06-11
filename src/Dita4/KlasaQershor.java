package Dita4;

/**
 * Created by erald on 17-06-07.
 */
public class KlasaQershor {

    public static void main(String[] args){

        int mbledhja = Mblidh(200, 45, 222);
        int rroga = mbledhja * 20000;
        double RrMesatare = Mesatarja(205, 30, 40);
        System.out.println(rroga);
        System.out.println(RrMesatare);

    }
    // Krijohen metodat dhe perdoren me larte
    public static int Mblidh(int a, int b, int c){
        return(a+b+c);
    }
    public static double Mesatarja(int a, int b, int c){
        return(a+b+c)/3;
    }
}
