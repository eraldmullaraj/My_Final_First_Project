package Dita4;

/**
 * Created by erald on 17-06-08.
 */
public class KlasaEKubit {
    public static void main (String[] args){
        Kubi kubi1 = new Kubi(20, 30,40);
        Kubi kubi2 = new Kubi();

        System.out.println(kubi1.getCubeVolume());
        System.out.print(kubi2.getCubeVolume());
    }
}
