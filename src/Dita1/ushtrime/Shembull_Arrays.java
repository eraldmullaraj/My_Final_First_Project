package Dita1.ushtrime;

/**
 * Created by erald on 17-04-30.
 */
public class Shembull_Arrays {
    public static void main(String []agrs) {
        int[] x = {3, 4, 5};
        System.out.println(x[1] + " " + x[2]);

        System.out.println("--------------");

        for(int temp : x){
            System.out.println(temp);
        }

        System.out.println("--------------");

        int[] a = new int [6];
        a[0]=2;
        a[4]=5;
        for(int temp2 : a) {
            System.out.println(temp2);
        }

        System.out.println("--------------");

        String[]c = {"nje", "Dy", "Tre"};
        for(String temp3 : c) {
            System.out.println(temp3);
        }
        String[] d = new String  [5];
        d[0]="2";
        d[4]="5";
        for(String  tempe : d) {
            System.out.println(tempe);
        }
    }
}
