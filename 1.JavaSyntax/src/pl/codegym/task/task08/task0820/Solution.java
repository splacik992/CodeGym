package pl.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Zwierzęcy secik
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Pies> psy = utworzPsy();

        Set<Object> zwierzeta = dolacz(koty, psy);
        printZwierzeta(zwierzeta);

        usunKoty(zwierzeta, koty);
        printZwierzeta(zwierzeta);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> wynik = new HashSet<Kot>();

        Kot kot1 = new Kot();
        Kot kot2 = new Kot();
        Kot kot3 = new Kot();
        Kot kot4 = new Kot();

        wynik.add(kot1);
        wynik.add(kot2);
        wynik.add(kot3);
        wynik.add(kot4);

        return wynik;
    }

    public static Set<Pies> utworzPsy() {

        HashSet<Pies> pieski = new HashSet<>();
        Pies pies1 = new Pies();
        Pies pies2 = new Pies();
        Pies pies3 = new Pies();

        pieski.add(pies1);
        pieski.add(pies2);
        pieski.add(pies3);
        return pieski;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {
        //tutaj wpisz swój kod

        Set<Object> zwierzeta = new HashSet<>();
        zwierzeta.addAll(koty);
        zwierzeta.addAll(psy);

        return zwierzeta;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {
        //tutaj wpisz swój kod
        for (Kot kotki : koty
        ) {
            zwierzeta.removeAll(koty);
        }
    }

    public static void printZwierzeta(Set<Object> zwierzeta) {
        //tutaj wpisz swój kod

        for (Object s : zwierzeta
        ) {
            System.out.println(s);
        }
    }

    public static class Kot {
    }

    public static class Pies {
    }

}
