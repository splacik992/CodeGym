package pl.codegym.task.task04.task0442;


/* 
Dodawanie
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int suma = 0;


        while (true) {

            int cyfra = Integer.parseInt(reader.readLine());
            if(cyfra == -1){
                System.out.println(cyfra + suma);
                break;
            }else {
                suma += cyfra;
            }
        }

    }
}

