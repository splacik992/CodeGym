package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int dodatnia = 0;
        int ujemna = 0;


        if (a > 0) {
            dodatnia++;
        } else
            ujemna++;

        if (b > 0) {
            dodatnia++;
        } else
            ujemna++;

        if (c > 0) {
            dodatnia++;
        } else
            ujemna++;
        if (dodatnia == 0) {
            System.out.println("Liczba liczb dodatnich: 0");
        } else if (ujemna == 0) {
            System.out.println("Liczba liczb ujemnych: 0");
        }


        System.out.println("Liczba liczb ujemnych: " + ujemna);
        System.out.println("Liczba liczb dodatnich: " + dodatnia);

    }
}
