package Dita1.ushtrime;

/**
 * Created by erald on 17-04-30.
 */
public class Shembull_Switch {
    public static void main(String []agrs) {
        int j = 6;
        while ( j<=10){
            switch (j) {
                case 0:
                    System.out.println("ky eshte rasti i pare");
                    break;
                case 3:
                    System.out.println("ky eshte rasti i trete");
                    break;
                case 6:
                    System.out.println("ky eshte rasti i gjashte");
                    break;
                case 8:
                    System.out.println("ky eshte rasti i tete");
                    break;
            }
            j += 2;
        }
    }
}
