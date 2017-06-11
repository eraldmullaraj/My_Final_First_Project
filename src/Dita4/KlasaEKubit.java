package Dita4;

/**
 * Created by erald on 17-06-08.
 */
public class KlasaEKubit {
    public static void main (String[] args){

        // Kubi eshte krijuar tek klasa Kubi, dhe ketu therritet
        Kubi kubi1 = new Kubi(20, 30,40);
        Kubi kubi2 = new Kubi(); // Kubi default

        System.out.println(kubi1.getCubeVolume());
        System.out.print(kubi2.getCubeVolume());
    }
}
