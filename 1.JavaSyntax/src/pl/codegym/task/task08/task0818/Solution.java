package pl.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Tylko dla bogaczy
*/

public class Solution {
    public static HashMap<String, Integer> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Wozniak", 1500);
        people.put("Paliwoda", 2000);
        people.put("Skalecka", 1200);
        people.put("Laskowski", 3000);
        people.put("Pawlak", 4000);
        people.put("palik", 400);
        people.put("Kimono", 550);
        people.put("Marabaela", 5500);
        people.put("Palaal", 3450);
        people.put("Komun", 2349);

        return people;
    }

    public static void usunPozycjeZmap(HashMap<String, Integer> map) {
        //tutaj wpisz swój kod
        HashMap<String, Integer> copy = new HashMap<>(map);

        for (Map.Entry<String, Integer> lista : copy.entrySet()) {
            for(Map.Entry<String,Integer> lista2 : copy.entrySet()){
                if(lista2.getValue()<500){
                    Integer wartosc = lista2.getValue();
                    if(lista.getValue().equals(wartosc)){
                        map.remove(lista.getKey());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}