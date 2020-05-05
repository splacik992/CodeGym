package pl.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Spis ludności
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Anna", "Lelistryj");
        map.put("Dawid", "Kowalski");
        map.put("Łukasz", "Bądzsława");
        map.put("Balatazar", "Bądzsława");
        map.put("Łukassz", "Beniamin");
        map.put("Baltazaar", "Berwin");
        map.put("Bartłomiej", "Laurenty");
        map.put("Batylda", "Lelistryj");
        map.put("Bdzigost", "Lelistryj");
        map.put("Bega", "Balladyna");

        return map;
    }

    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {

        int licznikImion = 0;

        for (String s : map.values()){
            if (s.equals(imie)){
                licznikImion++;
            }
        }
        return licznikImion;

    }

    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {

        int licznikNazwisk = 0;
        for(String s : map.keySet()){
            if(s.equals(nazwisko)){
                licznikNazwisk++;
            }
        }
        return licznikNazwisk;
    }

    public static void main(String[] args) {

    }
}