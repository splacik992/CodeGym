package pl.codegym.task.task05.task0519;

/* 
Chodzenie w kółko
*/

public class Kolo {
    //tutaj wpisz swój kod
    int srodekX;
    int srodekY;
    int promien;
    int szerokosc;
    int kolor;

    public  Kolo (int srodekX, int srodekY, int promien){
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
    }

    public  Kolo (int srodekX, int srodekY, int promien, int szerokosc){
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = szerokosc;
    }
    public  Kolo (int srodekX, int srodekY, int promien, int szerokosc, int kolor){
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = szerokosc;
        this.kolor = kolor;
    }
    public static void main(String[] args) {

    }
}
