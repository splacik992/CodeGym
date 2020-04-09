package pl.codegym.task.task04.task0417;

/* 
Masz parę?
*/

import java.io.*;
import java.sql.SQLOutput;
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int a;
        int b;
        int c;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a == b && a != c && b != c){
            System.out.println(a + " " + b);
        }

        if (b == c && b != a && c != a){
            System.out.println(b + " " + c);
        }

        if (a == c && a != b && c != b){
            System.out.println(a + " " + c);
        }

        else if (a==b && a==c && b==c){
            System.out.println(a + " " + b + " " + c);

        }


    }
}