package pl.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Współdzielone nazwiska i imiona
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> mapa = utworzMapLudzi();
        printMapLudzi(mapa);
    }

    public static Map<String, String> utworzMapLudzi() {
        //tutaj wpisz swój kod
        HashMap<String,String> mapa = new HashMap<>();
        mapa.put("Wozniak","Kamil");
        mapa.put("Wozniak","Jarek");
        mapa.put("Krzysk","Wojtek");
        mapa.put("Pawilniak","Tomas");
        mapa.put("Pali","Andrej");
        mapa.put("Saka","Wojtek");
        mapa.put("WOlak","Fiolek");
        mapa.put("Krzysk","Kamil");
        mapa.put("Maloch","Marcin");
        mapa.put("Malok","Marcin");

        return mapa;
    }

    public static void printMapLudzi(Map<String, String> mapa) {
        for (Map.Entry<String, String> s : mapa.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
