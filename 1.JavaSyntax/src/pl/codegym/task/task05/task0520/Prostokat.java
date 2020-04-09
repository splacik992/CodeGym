package pl.codegym.task.task05.task0520;

/* 
Utwórz klasę Prostokat
*/

public class Prostokat {
    //tutaj wpisz swój kod
    int gora;
    int lewy;
    int szerokosc;
    int wysokosc;

    public Prostokat (int gora, int lewy){
        this.gora = gora;
        this.lewy = lewy;
    }public  Prostokat (int gora, int lewy, int szerokosc){
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
    }public  Prostokat (int gora, int lewy, int szerokosc, int wysokosc){
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public Prostokat(int gora){
        this.gora = gora;
    }

    public static void main(String[] args) {

    }
}
