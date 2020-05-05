package pl.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Najdłuższa sekwencja
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int liczba = Integer.parseInt(reader.readLine());
            lista.add(liczba);

        }
        int count = 1;
        int tab[] = new int[10];
        for (int i = 1; i < 10; i++) {
            if (lista.get(i).equals(lista.get(i - 1))) {
                count++;
                tab[i] = count;
            } else {
                tab[i] = count;
                count = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (tab[i] >= max)
                max = tab[i];

        }
        System.out.println(max);

    }

}