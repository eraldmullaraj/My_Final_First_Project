package Dita2.ushtrime;

/**
 * Created by erald on 17-04-30.
 */
public class Ushtrimi_2 {
    public static void main(String []agrs)
    {
        String [] numrat ={"12","14","17"} ;
        int total = 0;
        for (String temp : numrat){
            total += Integer.parseInt(temp);
        }

        System.out.println("shuam eshte " + total);
        String a = "Hello Word";
        System.out.println(a.substring(5).toLowerCase());
    }
}
