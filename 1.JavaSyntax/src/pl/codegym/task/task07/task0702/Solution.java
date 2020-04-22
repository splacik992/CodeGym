package pl.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Tablica z ciągami w odwrotnej kolejności
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] tab = new String[10];
        for (int i = 0; i <tab.length - 2 ; i++) {
            tab[i] = reader.readLine();
        }
        for (int i = 9; i >=0 ; i--) {
            System.out.println(tab[i]);
        }

    }
}