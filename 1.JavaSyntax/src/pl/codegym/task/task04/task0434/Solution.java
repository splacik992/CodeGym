package pl.codegym.task.task04.task0434;


/* 
Tabliczka mnożenia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int i = 0;
        while (i < 10) {
            i++;
            int j = 0;
            while (j < 10) {
                j++;
                int wynik = i * j;

                System.out.print(wynik + " ");


            }
            System.out.println();
        }

    }
}

