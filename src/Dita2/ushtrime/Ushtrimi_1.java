package Dita2.ushtrime;

/**
 * Created by erald on 17-04-30.
 */
public class Ushtrimi_1 {
    public static void main(String []agrs)
    {
        System.out.println("Hello Word");
        double rroga = 150000;
        double taksa = 0.0;
        if(rroga <= 20000){
            taksa = rroga*.1;
        }else if(rroga <= 50000){
            taksa = 2000 + rroga*.15;
        }else{
            taksa = 6500 + rroga*.2;
        }
        double rroga_ne_dore = rroga - taksa;
        System.out.println("Rroga ne dore eshte " + rroga_ne_dore + "dhe taksa eshte" + taksa);

    }
}
