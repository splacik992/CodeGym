package pl.codegym.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;

/* 
HashMap Obiektów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> mapa = new HashMap<String, Object>();
        mapa.put("Sim", 5);
        mapa.put("Tom", 5.5);
        mapa.put("Arbus", false);
        mapa.put("Dzieciak", null);
        mapa.put("Kot", "Kot");
        mapa.put("Je", 56L);
        mapa.put("Jedzonko", '3');
        mapa.put("Gevey", '6');
        mapa.put("Przytulas", 111111111111L);
        mapa.put("Comp", (double) 123);

        //tutaj wpisz swój kod
        for (Map.Entry<String,Object> obiekty : mapa.entrySet()
             ) {
            System.out.println(obiekty.getKey() + " - " + obiekty.getValue());
        }

    }
}
