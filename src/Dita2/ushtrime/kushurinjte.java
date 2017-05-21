package Dita2.ushtrime;

/**
 * Created by erald on 17-04-30.
 */
public class kushurinjte {
    public static void main(String[] args){
        fitimi Erald, Erjon;
        Erald = new fitimi();
        Erjon = new fitimi();
        // ose
        fitimi2 Fatjon = new fitimi2(1200000,50000,50000,70000);
        fitimi2 Berti = new fitimi2(200000,40000,130000,50000);

        Erald.setRrogaEPunes(1000000);
        Erald.setTaksat(50000);
        Erald.setShpenzimetEKafeve(80000);
        Erald.setShpenzimetEMakines(100000);
        System.out.println("Fitimi mujor i Eraldit eshte " + Erald.llogaritFitimin() + "LEK kurse ai vjetor eshte " + Erald.llogaritFitiminVjetor()+"LEK");
        System.out.println ("Fitimi mujor i Fatjonit eshte "+Fatjon.gjejFitiminMujor(2));
        System.out.println (Fatjon.gjejShpwnzimetMujore(5));
        System.out.println (Berti.gjejFitiminMujor(1));

    }
}
