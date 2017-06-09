package Dita4;

/**
 * Created by erald on 17-05-16.
 */
public class Objektet {
    public static void main(String[] args) {
        Student Erald = new Student();
        Student Erjon = new Student();
        Student Fatjon = new Student();
        Student Tomas = new Student();

        Erald.setEmri("Erald");
        Erald.setMosha(29);

        Erjon.setEmri("Erjon Jhony");
        Erjon.setMosha(28);

        System.out.println("Nr i studenteve ne klase " + Student.getNumriIStudentave());
        System.out.print("Mosha e Eraldit eshte " + Erald.getMosha());
    }

}
