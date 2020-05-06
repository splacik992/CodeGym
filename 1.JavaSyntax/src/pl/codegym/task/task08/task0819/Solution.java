package pl.codegym.task.task08.task0819;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Koci Set
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();

        //tutaj wpisz swój kod. krok 3

        for (Kot kot : koty) {
            koty.remove(kot);
            break;
        }

        printKoty(koty);
    }

    public static Set<Kot> utworzKoty() {
        //tutaj wpisz swój kod. krok 2
        Set<Kot> kociki = new HashSet<>();
        Kot kot = new Kot();
        Kot kot2 = new Kot();
        Kot kot3 = new Kot();

        kociki.add(kot);
        kociki.add(kot2);
        kociki.add(kot3);
        return kociki;
    }

    public static void printKoty(Set<Kot> koty) {
        // krok 4

        for (Kot kociki : koty) {
            System.out.println(kociki);
        }
    }

    // krok 1
    public static class Kot {
    }
}
