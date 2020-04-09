package pl.codegym.task.task04.task0424;

/* 
Trzy liczby
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a != b && a != c && c == b) {
            System.out.println(1);
        }
         if (b != a && b != c && a == c) {
            System.out.println(2);
        }
        if (c != a & c != b && a == b) {
            System.out.println(3);
        }
    }
}
