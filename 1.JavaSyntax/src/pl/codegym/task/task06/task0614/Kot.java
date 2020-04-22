package pl.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Statyczne koty
*/

public class Kot {
    //tutaj wpisz swój kod
    public static ArrayList<Kot> koty = new ArrayList<>();


    public Kot() {
    }

    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Kot kot = new Kot();
        Kot kot2 = new Kot();
        Kot kot3 = new Kot();
        Kot kot4 = new Kot();
        Kot kot5 = new Kot();
        Kot kot6 = new Kot();
        Kot kot7 = new Kot();
        Kot kot8 = new Kot();
        Kot kot9 = new Kot();
        Kot kot10 = new Kot();

        koty.add(kot);
        koty.add(kot2);
        koty.add(kot3);
        koty.add(kot4);
        koty.add(kot5);
        koty.add(kot6);
        koty.add(kot7);
        koty.add(kot8);
        koty.add(kot9);
        koty.add(kot10);
        printKoty();
    }

    public static void printKoty() {
        //tutaj wpisz swój kod
        for (Kot kociki : koty) {
            System.out.println(kociki);
        }
    }
}

