package pl.codegym.task.task06.task0607;

/* 
Licznik klasy
*/

public class Kot {
    //tutaj wpisz swój kod
    private static int licznikKotkow = 0;

    public Kot() {
        licznikKotkow++;
    }

    public static void main(String[] args) {
        Kot kot = new Kot();
        System.out.println(licznikKotkow);
    }
}
