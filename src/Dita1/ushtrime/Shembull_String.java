package Dita1.ushtrime;

/**
 * Created by erald on 17-04-30.
 */
public class Shembull_String {
    public static void main(String []agrs) {
            String x = "Erald";
            System.out.println("Hello " + x);
            System.out.println(x.toUpperCase());
            System.out.println(x.substring(1,3)); /* Nuk perfshihet 3*/
            System.out.println(x.charAt(4));

            String mosha = "29";
            String paga = "500";

            int a = Integer.parseInt(mosha);
            System.out.println(a);

            double s = Double.parseDouble(paga);
            System.out.println(s);
    }
}
