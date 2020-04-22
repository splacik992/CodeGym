package pl.codegym.task.task05.task0526;

/* 
Mężczyzna i kobieta
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Mezczyzna mezczyzna = new Mezczyzna("marcin", 11 , "agaga");
        Mezczyzna mezczyzna2 = new Mezczyzna("raf", 22 , "afa");
        Kobieta kobieta = new Kobieta("ana", 44 , "agrgr");
        Kobieta kobieta2 = new Kobieta("bolek", 11 , " gageegeg");


        System.out.println(mezczyzna.imie + " " + mezczyzna.wiek + " " + mezczyzna.adres);
        System.out.println(mezczyzna2);
        System.out.println(kobieta.imie + " " + kobieta.wiek + " " + kobieta.adres);
        System.out.println(kobieta2.imie + " " + kobieta2.wiek + " " + kobieta2.adres);
    }




    public static class Mezczyzna {
        String imie;
        int wiek;
        String adres;


        public Mezczyzna(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }

        public Mezczyzna() {
            this.imie = "Bartek";
            this.wiek = 25;
            this.adres = "adres";
        }
    }public static class Kobieta {
        String imie;
        int wiek;
        String adres;


        public Kobieta(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }

        public Kobieta() {
            this.imie = "Marlena";
            this.wiek = 22;
            this.adres = "2 adres";
        }
    }
    //tutaj wpisz swój kod
}
