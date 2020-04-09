package pl.codegym.task.task04.task0426;

/* 
Etykiety i liczby
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner b= new Scanner(System.in);
        int a=b.nextInt();
        if (a==0){
            System.out.println("Zero");
        }
        if (a>0 && a%2!=1){
            System.out.println("Dodatnia liczba parzysta");
        }
        if (a<0 && a%2==0){
            System.out.println("Ujemna liczba parzysta");
        }
        if (a>0 && a%2!=0){
            System.out.println("Dodatnia liczba nieparzysta");
        }
        if (a<0 && a%2!=0){
            System.out.println("Ujemna liczba nieparzysta");
        }
    }
}
