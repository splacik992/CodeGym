package pl.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Ulice i domy
*/

public class Solution {
    private static int parzyste;
    private static int nieparzyste;

    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];

        for (int i = 0; i < 15; i++) {

            array[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0) {
                Solution.parzyste += array[i];

            } else {
                Solution.nieparzyste += array[i];
            }
        }


        if (parzyste <= nieparzyste) {
            System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach.");
        } else {
            System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");
        }
    }
}
