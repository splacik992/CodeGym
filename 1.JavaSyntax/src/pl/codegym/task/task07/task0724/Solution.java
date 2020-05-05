package pl.codegym.task.task07.task0724;

/* 
Spis członków rodziny
*/

import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static void main(String[] args) {
        // tutaj wpisz swój kod

        Ludzie ludzie1 = new Ludzie("rafal",true, 20);
        Ludzie ludzie2 = new Ludzie("wojtek",true, 10);
        Ludzie ludzie3 = new Ludzie("piotrek",true, 27);
        Ludzie ludzie4 = new Ludzie("janina",false, 29);

        Ludzie ludzie5 = new Ludzie("wojtek",true, 10,ludzie1,ludzie2);
        Ludzie ludzie6 = new Ludzie("jacek",true, 10,ludzie3,ludzie4);
        Ludzie ludzie7 = new Ludzie("asia",false, 10,null,ludzie2);
        Ludzie ludzie8 = new Ludzie("aga",false, 10,ludzie4,null);
        Ludzie ludzie9 = new Ludzie("wojtek",true, 10,ludzie8,ludzie7);

        System.out.println(ludzie1);
        System.out.println(ludzie2);
        System.out.println(ludzie3);
        System.out.println(ludzie4);
        System.out.println(ludzie5);
        System.out.println(ludzie6);
        System.out.println(ludzie7);
        System.out.println(ludzie8);
        System.out.println(ludzie9);


    }

    public static class Ludzie {
        // tutaj wpisz swój kod
        private String imie;
        private boolean plec;
        private int wiek;
        Ludzie matka;
        Ludzie ojciec;

        public Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;

        }

        public Ludzie(String imie, boolean plec, int wiek, Ludzie matka, Ludzie ojciec) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.matka = matka;
            this.ojciec = ojciec;
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null)
                tekst += ", ojciec: " + this.ojciec.imie;

            if (this.matka != null)
                tekst += ", matka: " + this.matka.imie;

            return tekst;
        }


    }
}