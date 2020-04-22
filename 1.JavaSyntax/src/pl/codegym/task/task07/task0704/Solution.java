package pl.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Odwróć tablicę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] values = new int[10];

        for (int i = 0; i <10 ; i++) {
            values[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 9; i >=0; i--) {
            System.out.println(values[i]);
        }
    }
}

