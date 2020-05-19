package pl.codegym.task.task10.task1006;

/* 
Zadanie nr 6 z konwersją typu int
*/

public class Solution {
    public static void main(String[] args) {
        double d =  2.50256e2d;
        char c = (int) 'd';
        short s = (short) 2.22;
        int i = (int) 150000;
        float f = (float) 0.50f;
        double wynik = f + (i / c) - (d * s) - 500e-3;
        System.out.println("wynik: " + wynik);
    }
}