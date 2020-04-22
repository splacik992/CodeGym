package pl.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Samotne tablice oddziałują na siebie
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] listaStringow = new String[10];
        int[] liczby = new int[10];

        for(int i=0;i<listaStringow.length;i++){
            listaStringow[i] = scan.nextLine();

            liczby[i] = listaStringow[i].length();
        }
        for(int j=0;j<liczby.length;j++){
            System.out.println(liczby[j]);
        }
    }
}