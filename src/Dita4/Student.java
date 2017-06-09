package Dita4;

/**
 * Created by erald on 17-05-16.
 */
public class Student {
    String emri;
    int mosha;
    static int numriIStudenteve = 0;

    Student(){
        numriIStudenteve++;
    }
    public static int getNumriIStudentave(){
        return numriIStudenteve;
    }

    public int getMosha() {
        return mosha;
    }
    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public String getEmri() {
        return emri;
    }
    public void setEmri(String emri) {
        this.emri = emri;
    }

}
