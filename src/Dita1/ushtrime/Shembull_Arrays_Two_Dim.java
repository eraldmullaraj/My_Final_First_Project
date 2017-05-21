package Dita1.ushtrime;

/**
 * Created by erald on 17-04-30.
 */
public class Shembull_Arrays_Two_Dim {
    public static void main(String []agrs) {
        int[][] x = new int [5][4];
        System.out.println(x[1][1] + " " + x[2][2]);

        System.out.println("--------------");

        int temp = 10;
        for (int i=0;i<4;i++) {

            for (int j=0;j<3;j++){
                x[i][j]=temp;
                temp += 10;
            System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}
