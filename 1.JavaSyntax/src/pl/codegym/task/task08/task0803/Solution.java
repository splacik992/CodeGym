package pl.codegym.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
HashMap kotów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] koty = new String[]{"Tygrysek", "Mania", "Odlot", "Marmolada", "Oskar", "Śnieżek", "Szefu", "Kafel", "Max", "Simba"};

        HashMap<String, Kot> mapa = dodajKotyDoMap(koty);

        for (Map.Entry<String, Kot> para : mapa.entrySet()) {
            System.out.println(para.getKey() + " - " + para.getValue());
        }
    }


    public static HashMap<String, Kot> dodajKotyDoMap(String[] koty) {
        //tutaj wpisz swój kod
        HashMap<String,Kot> para = new HashMap<>();

        Kot[] kot = new Kot[koty.length];


        for (int i = 0; i <koty.length ; i++) {
            kot[i] = new Kot(koty[i]);
        }
        for (int i = 0; i <koty.length ; i++) {
            para.put(koty[i],kot[i]);
        }
        return para;
    }


    public static class Kot {
        String imie;

        public Kot(String imie) {
            this.imie = imie;
        }

        @Override
        public String toString()  {
            return imie != null ? imie.toUpperCase() : null;
        }
    }
}
