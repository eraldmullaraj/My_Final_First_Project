package Dita4;

/**
 * Created by erald on 17-06-08.
 */
public class Kubi {
    //atributet qe  merr kubi
    int gjatesia;
    int gjeresia;
    int lartesia;

    // metoda per gjetjen e vellimit
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
