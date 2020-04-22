package pl.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Bank-świnka na bazie konsoli
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int suma = 0;

        while (true) {
            String value = reader.readLine();
            if (value.equals("sumuj")){
                break;}
            else {
                int x = Integer.parseInt(value);
                suma += x;
            }


        }
        System.out.println(suma);
    }
}
