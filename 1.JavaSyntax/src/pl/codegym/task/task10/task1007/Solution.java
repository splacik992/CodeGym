package pl.codegym.task.task10.task1007;

/* 
Zadanie nr 7 z konwersją typu int
*/

public class Solution {
    public static void main(String[] args) {
        long l = (int) 1234_564_890L;
        int x =  0b1000_1100_1010;
        double m = (int) 110_987_654_6299.123_34;
        float f = (int) l++ + 10 + ++x - (int) m;
        l = (int) f / 1000;
        System.out.println(l);
    }
}