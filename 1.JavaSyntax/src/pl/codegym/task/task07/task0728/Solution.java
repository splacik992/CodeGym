package pl.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
W kolejności malejącej
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] tablica = new Integer[5];
        for (int i = 0; i < 5; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }



        for (int x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(int[] tablica) {

        int last = tablica.length - 1;
        int middle = tablica.length / 2;

        for (int i = 0; i <= middle; i++) {

            int temp = tablica[i];
            tablica[i] = tablica[last - i];
            tablica[last - 1] = temp;
        }
    }
}

