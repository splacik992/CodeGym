package pl.codegym.task.task09.task0907;

/* 
Korzystanie z wyjątków przy pracy z liczbami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        try {
            int a = 42 / 0;
        }catch (ArithmeticException e){


            System.out.println("Wyjatek osluzony" + e);
        }
        //tutaj wpisz swój kod
    }
}
