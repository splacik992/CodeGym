package pl.codegym.task.task05.task0505;

/* 
Kocia jatka
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Kot kot = new Kot("Mara", 20, 10, 100);
        Kot kot2 = new Kot("Maraa", 12, 11, 80);
        Kot kot3 = new Kot("Mara44", 22, 7, 40);
        System.out.println(kot.walka(kot3));
        System.out.println(kot2.walka(kot3));
        System.out.println(kot2.walka(kot));
    }

    public static class Kot {
        protected String imie;
        protected int wiek;
        protected int waga;
        protected int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }

        public boolean walka(Kot innyKot) {
            int wiekPrzewaga = this.wiek > innyKot.wiek ? 1 : 0;
            int wagaPrzewaga = this.waga > innyKot.waga ? 1 : 0;
            int silaPrzewaga = this.sila > innyKot.sila ? 1 : 0;

            int wynik = wiekPrzewaga + wagaPrzewaga + silaPrzewaga;
            return wynik > 2; // return wynik > 2 ? true : false;
        }
    }
}