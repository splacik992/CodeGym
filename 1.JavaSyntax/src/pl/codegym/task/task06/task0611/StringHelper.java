package pl.codegym.task.task06.task0611;

/* 
Klasa StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String wynik = "";

        int i = 0;

        while (i < 5) {
            wynik = wynik + s;
            i++;
        }
        return wynik;
    }

    public static String multiply(String s, int licznik) {
        String wynik = "";
        //tutaj wpisz swój kod
        int i = 0;
        while (i < licznik) {
            i++;
            wynik = wynik + s;
        }
        return wynik;
    }

    public static void main(String[] args) {

    }
}
