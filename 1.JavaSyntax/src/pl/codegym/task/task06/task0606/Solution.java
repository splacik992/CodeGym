package pl.codegym.task.task06.task0606;

import java.io.*;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(reader.readLine());


        while(value > 0 ){
            if((value% 10) % 2 == 0)
                Solution.parzyste++;
            else
                Solution.nieparzyste++;
            value = value /10;
        }
        System.out.println("Parzyste: " + Solution.parzyste + " Nieparzyste: " + Solution.nieparzyste);
    }
}
