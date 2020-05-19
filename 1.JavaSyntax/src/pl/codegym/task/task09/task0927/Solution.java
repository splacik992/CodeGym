package pl.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Dziesięć kotów
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Kot> mapa = utworzMap();
        Set<Kot> set = konwertujMapDoSet(mapa);
        printSetKotow(set);
    }

    public static Map<String, Kot> utworzMap() {
        //tutaj wpisz swój kod
        Map<String , Kot> map = new HashMap<>();

        map.put("koc",new Kot("Florek"));
        map.put("kok",new Kot("Balwan"));
        map.put("kcik",new Kot("Gafa"));
        map.put("ocik",new Kot("Mana"));
        map.put("kik",new Kot("Taka"));
        map.put("cik",new Kot("Jak"));
        map.put("k",new Kot("Loko"));
        map.put("kck",new Kot("Fazo"));
        map.put("oik",new Kot("Cipek"));
        map.put("kocik",new Kot("Banan"));
        return map;
    }

    public static Set<Kot> konwertujMapDoSet(Map<String, Kot> mapa) {
        //tutaj wpisz swój kod
        Set<Kot> kociki = new HashSet<>();
        for (Map.Entry<String,Kot> entry : mapa.entrySet())
        {
            kociki.add(entry.getValue());
        }
        return kociki;
    }

    public static void printSetKotow(Set<Kot> set) {
        for (Kot kot : set) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;

        public Kot(String imie) {
            this.imie = imie;
        }

        public String toString() {
            return "Kot " + this.imie;
        }
    }


}
