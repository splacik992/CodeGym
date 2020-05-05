package pl.codegym.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String, String> people = new HashMap<>();
        people.put("Marciniak", "Piotr");
        people.put("Woja", "Wojtek");
        people.put("Malo", "Wojtek");
        people.put("Aloch", "Piotr");
        people.put("Maloch", "Krzysztof");
        people.put("Polak", "Rafal");
        people.put("Polaczek", "Magda");
        people.put("Polla", "ALa");
        people.put("Jeesk", "Adrian");
        people.put("Kupa", "Seba");
        return people;

    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        //tutaj wpisz swój kod

        HashMap<String,String> copy = new HashMap<>(mapa);

        for (Map.Entry<String,String> para : copy.entrySet()) {
            for(Map.Entry<String,String> para2 : copy.entrySet()){
                String wartosc = para2.getValue();
                if(para.getValue().equals(wartosc) && para.getKey()!= para2.getKey()){
                    usunElementZMapPoWartosci(mapa,para2.getValue());
                }
            }
        }
    }

    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc))
                mapa.remove(para.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
