package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {
    //tutaj wpisz swój kod
    public String imie;
    public int wiek;
    public int waga;
    public String adres;
    public String kolor;



    public void inicjalizuj(String imie) {

        this.imie = imie;
        this.wiek = 4;
        this.waga = 6;
        this.kolor = "bialy";
        this.adres = null;
    }

    public void inicjalizuj(String imie, int waga, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
        this.kolor = "rozowy";
    }

    public void inicjalizuj(String imie, int wiek) {
        this.imie = "Bartek";
        this.wiek = 3;
        this.waga = 7;
        this.kolor = "bialy";
    }

    public void inicjalizuj(int waga, String kolor) {
        this.imie = null;
        this.wiek = 8;
        this.waga = waga;
        this.kolor = kolor;
        this.adres = null;
    }

    public void inicjalizuj(int waga, String kolor, String adres) {
        this.wiek = 6;
        this.waga = waga;
        this.kolor = kolor;
        this.adres = adres;
    }

    public static void main(String[] args) {



    }
}
