package pl.codegym.task.task06.task0613;

/* 
Kot i statyczne
*/

public class Solution {
    public static void main(String[] args) {
        // Tworzy 10 kotów
        Kot kot = new Kot();
        Kot kot2 = new Kot();
        Kot kot3 = new Kot();
        Kot kot4 = new Kot();
        Kot kot5 = new Kot();
        Kot kot6 = new Kot();
        Kot kot7 = new Kot();
        Kot kot8 = new Kot();
        Kot kot9 = new Kot();
        Kot kot10 = new Kot();

        System.out.println(Kot.licznikKotow);
        // Wyświetla wartość zmiennej licznikKotow
    }

    public static class Kot {
        // Tworzy zmienną statyczną licznikKotow
        public static int licznikKotow;

        public Kot() {
            licznikKotow++;
        }

        // Deklaruje konstruktor
    }
}
