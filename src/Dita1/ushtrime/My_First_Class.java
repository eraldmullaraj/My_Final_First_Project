package Dita1.ushtrime;

/**
 * Created by erald on 17-04-29.
 * byte     8       -128 - 127
 * short    16      -32,768 - 32,767
 * int      32      -2,147,483,648 - 2,147,483,647
 * long     64      -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807
 * float    32      1.4e-045 - 3.4e+038
 * double   64      4.93-324 - 1.8e+308
 * char     16      'y'
 * boolean  1       true or false
 */
public class My_First_Class {
    public static void main(String []agrs)
    {
        System.out.println("Hello Word");
        int x =45;
        int y = 23;
        int rezultati = x + y;
        int mbetja = x%y;
        System.out.println("shuma e x + y eshte " + rezultati);
        System.out.println("mbetja e x me y eshte " + mbetja);
        if(x<y)
        {
            int diferenca = y - x;
            System.out.println("x eshte me i vogel se y me " + diferenca + " njesi");
        }

        else if(x==y)
        {
            System.out.println("x eshte me i barabarte se y");
        }

        else
        {
            int diferenca2 = x - y;
            System.out.println("x eshte me i madhe se y me " + diferenca2 + " njesi");
        }
    }
}
