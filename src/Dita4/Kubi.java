package Dita4;

/**
 * Created by erald on 17-06-08.
 */
public class Kubi {

    int gjatesia;
    int gjeresia;
    int lartesia;
    public int getCubeVolume(){
        return (gjatesia*gjeresia*lartesia);
    }

    // Vellimi default i kubit
    Kubi(){
        gjatesia = 10;
        gjeresia = 10;
        lartesia = 10;
    }

    Kubi(int a, int b, int c){
        gjatesia = a;
        gjeresia = b;
        lartesia = c;
    }

}
