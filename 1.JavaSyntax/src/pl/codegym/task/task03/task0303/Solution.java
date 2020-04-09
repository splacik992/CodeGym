package pl.codegym.task.task03.task0303;

/* 
Wymiana walut
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        System.out.println(konwertujEurNaUsd(20,3.45));
        System.out.println(konwertujEurNaUsd(20,0.19));

    }

    public static double konwertujEurNaUsd(double eur, double kursWymiany) {
        //tutaj wpisz swój kod7
        return eur * kursWymiany;
    }
}
