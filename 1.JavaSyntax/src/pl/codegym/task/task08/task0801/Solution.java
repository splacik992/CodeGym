package pl.codegym.task.task08.task0801;

/* 
HashSet roślin
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
HashSet<String> hashSet = new HashSet<>();

hashSet.add("arbuz");
hashSet.add("banan");
hashSet.add("wiśnia");
hashSet.add("gruszka");
hashSet.add("kantalupa");
hashSet.add("jeżyna");
hashSet.add("żeńszeń");
hashSet.add("truskawka");
hashSet.add("irys");
hashSet.add("ziemniak");

        for (String wynik: hashSet
             ) {
            System.out.println(wynik);

        }
    }
}
