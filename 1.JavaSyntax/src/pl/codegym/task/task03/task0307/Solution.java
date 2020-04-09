package pl.codegym.task.task03.task0307;

/* 
Witaj, StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Zerg zerg1 = new Zerg();
        zerg1.imie = "aega";
        Zerg zerg2 = new Zerg();
        zerg2.imie = ("alal2");
        Zerg zerg3 = new Zerg();
        zerg3.imie = ("alafe");
        Zerg zerg4 = new Zerg();
        zerg4.imie = ("grsgs");
        Zerg zerg5 = new Zerg();
        zerg5.imie = ("wariat");


        Protoss prot1 = new Protoss();
        prot1.imie = ("kub");
        Protoss prot2 = new Protoss();
        prot2.imie = ("efag");
        Protoss prot3 = new Protoss();
        prot3.imie = ("grajjgr");

        Terranin ter = new Terranin();
        ter.imie = ("aenfeanf");
        Terranin ter2 = new Terranin();
        ter2.imie = ("ghak");
        Terranin ter3 = new Terranin();
        ter3.imie = ("amama");
        Terranin ter4 = new Terranin();
        ter4.imie = ("habababa");
    }

    public static class Zerg {
        public String imie;
    }

    public static class Protoss {
        public String imie;
    }

    public static class Terranin {
        public String imie;
    }
}
