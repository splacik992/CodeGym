package pl.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Minimum i maksimum w tablicach
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maksimum;
        int minimum;

        int [] tab = new int[20];

        for (int i = 0; i <tab.length ; i++) {
            tab[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(tab);
        minimum = tab[0];
        maksimum = tab[tab.length - 1];

        //tutaj wpisz swój kod

        System.out.print(maksimum + " " + minimum);
    }
}
