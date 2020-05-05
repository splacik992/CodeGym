package pl.codegym.task.task08.task0814;

import javax.sound.sampled.SourceDataLine;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* 
Większa niż 10? Wcale do nas nie pasujesz!
*/

public class Solution {
    public static HashSet<Integer> utworzSet() {
        // tutaj wpisz swój kod

        HashSet<Integer> seciki = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            seciki.add(i);
        }
        return seciki;
    }

    public static HashSet<Integer> usunLiczbyWiekszeNiz10(HashSet<Integer> set) {
        // tutaj wpisz swój kod
        HashSet<Integer> copy = new HashSet<>(set);

        for (Integer s : copy) {

            if(s>10){
                set.remove(s);
            }
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
