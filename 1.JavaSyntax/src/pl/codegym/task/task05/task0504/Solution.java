package pl.codegym.task.task05.task0504;

/* 
Trzej Muszkoterowie
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Kot kot = new Kot("Ala", 22,12,100);
        Kot kot2 = new Kot("Aaala", 2,2,40);
        Kot kot3 = new Kot("Ala22", 21,10,80);
    }

    public static class Kot {
        public String imie;
        protected int wiek;
        int waga;
        private int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }
    }
}