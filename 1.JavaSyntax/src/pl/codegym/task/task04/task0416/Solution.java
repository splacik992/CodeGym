package pl.codegym.task.task04.task0416;

/* 
Przejście przez ulicę na oślep
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double t = Double.parseDouble(reader.readLine());


            if (t % 5.0 >= 0.0 && t % 5.0 < 3.0) {
                System.out.println("zielone");

            } else if (t % 5.0 >= 3.0 && t % 5.0 < 4.0) {
                System.out.println("żółte");

            }else{
                System.out.println("czerwone");

            }
    }
}