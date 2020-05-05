package pl.codegym.task.task08.task0802;

/* 
HashMap z 10 par
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("arbuz", "melon");
        hashMap.put("banan", "owoc");
        hashMap.put("wiśnia", "owoc");
        hashMap.put("gruszka", "owoc");
        hashMap.put("kantalupa", "melon");
        hashMap.put("jeżyna", "owoc");
        hashMap.put("żeńszeń", "korzeń");
        hashMap.put("truskawka", "owoc");
        hashMap.put("irys", "kwiat");
        hashMap.put("ziemniak", "bulwa");

        for (Map.Entry<String,String> wynik: hashMap.entrySet()
             ) {
            String klucz = wynik.getKey();
            String wartosc = wynik.getValue();

            System.out.println(klucz + " - " + wartosc);
        }


    }
}
