package pl.codegym.task.task05.task0517;

/* 
Tworzenie kotów
*/

public class Kot {
    //tutaj wpisz swój kod
    String imie = null;
    int wiek = 5;
    int waga = 3;
    String kolor = "white";
    String adres = null;

    public Kot(String imie) {
        this.imie = imie;
    }

    public Kot(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Kot(String imie, int waga, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
    }

    public Kot(int waga, String kolor, String adres) {
        this.waga = waga;
        this.kolor = kolor;
        this.adres = adres;
    }

    public Kot(int waga, String kolor) {
        this.waga = waga;
        this.kolor = kolor;
    }

    public static void main(String[] args) {

    }
}
