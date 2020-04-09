package pl.codegym.task.task04.task0427;

/* 
Opisywanie liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(reader.readLine());

        if(value > 0 && value < 10){
            if(value % 2 == 0){
                System.out.println("parzysta liczba jednocyfrowa");
            }else
                System.out.println("nieparzysta liczba jednocyfrowa");
        }
        if(value >= 10 && value < 100){
            if(value % 2 == 0){
                System.out.println("parzysta liczba dwucyfrowa");
            }else
                System.out.println("nieparzysta liczba dwucyfrowa");
        }
        if(value >= 100 && value < 1000){
            if(value % 2 == 0){
                System.out.println("parzysta liczba trzycyfrowa");
            }else
                System.out.println("nieparzysta liczba trzycyfrowa");
        }
    }
}
