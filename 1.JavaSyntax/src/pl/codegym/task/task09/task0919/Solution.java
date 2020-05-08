package pl.codegym.task.task09.task0919;

/* 
Dzielenie przez zero
*/

public class Solution {

    public static void main(String[] args) {

        try {
            dzielimyPrzezZero();
        }catch (Throwable e){
            e.printStackTrace();
        }


    }

    public static void dzielimyPrzezZero(){


        int i  = 10/0;
        System.out.println(i);
    }
}
