package Dita1.ushtrime;

/**
 * Created by erald on 17-04-30.
 */
public class Shembull_And_Or {
    public static void main(String []agrs) {
        int x, y;
        x = 6;
        y = 23;

        if (x > 10 && y > 10) {
            System.out.println("te dy numrat jane me te medhenje se 10");

        } else if (x > 10 || y > 10) {
            System.out.println("vetem nje nga numrat eshte me i madhe se 10");
        } else {
            System.out.println("te dy numrat jane me te vegjel se 10");
        }

    }
}
