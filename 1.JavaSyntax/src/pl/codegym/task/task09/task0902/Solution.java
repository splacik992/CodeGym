package pl.codegym.task.task09.task0902;

/* 
Ślad stosu wita ponownie
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //tutaj wpisz swój kod
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

    public static String method2() {
        method3();
        //tutaj wpisz swój kod
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        //tutaj wpisz swój kod
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }

    public static String method4() {
        method5();

        //tutaj wpisz swój kod

        return Thread.currentThread().getStackTrace()[4].getMethodName();
    }

    public static String method5() {
        //tutaj wpisz swój kod

        return Thread.currentThread().getStackTrace()[5].getMethodName();
    }
}
