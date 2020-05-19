package pl.codegym.task.task10.task1013;

/* 
Konstruktory klasy Ludzie
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Ludzie {
        // Wprowadź tu swoje zmienne i konstruktory
       private String imie;
       private String nazwisko;
       private boolean plec;
       private String zawod;
       private int wiek;
       private double wyplata;


        public Ludzie(String imie, int wiek, double wyplata) {
            this.imie = imie;
            this.wiek = wiek;
            this.wyplata = wyplata;
        }

        public Ludzie() {
        }

        public Ludzie(String imie, String nazwisko, boolean plec) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.plec = plec;
        }

        public Ludzie(String imie, String nazwisko, String zawod) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.zawod = zawod;
        }

        public Ludzie(String imie, String nazwisko, double wyplata) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.wyplata = wyplata;
        }

        public Ludzie(String imie, String nazwisko, boolean plec, String zawod, int wiek, double wyplata) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.plec = plec;
            this.zawod = zawod;
            this.wiek = wiek;
            this.wyplata = wyplata;
        }

        public Ludzie(String imie) {
            this.imie = imie;
        }

        public Ludzie(boolean plec) {
            this.plec = plec;
        }

        public Ludzie(int wiek) {
            this.wiek = wiek;
        }

        public Ludzie(double wyplata) {
            this.wyplata = wyplata;
        }
    }
}
