package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = 0;
        double y = 0;

        while (true) {

            int liczby = Integer.parseInt(reader.readLine());

            if (liczby != -1) {
                x += liczby;
                y++;
            } else
                break;


        }
        double srednia = x / y;
        System.out.println(srednia);


    }
}

