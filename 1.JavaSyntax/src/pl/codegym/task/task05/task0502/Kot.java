package pl.codegym.task.task05.task0502;

/* 
Zaimplementuj metodę walka
*/

public class Kot {

    public int wiek;
    public int waga;
    public int sila;

    public Kot() {
    }

    public boolean walka(Kot innyKot) {
        //tutaj wpisz swój kod
        if(this.wiek > innyKot.wiek)
            return true;

        else if(this.waga > innyKot.waga)
            return true;

        else if(this.sila > innyKot.sila)
            return true;
        else
        return false;
    }

    public static void main(String[] args) {

    }
}
