package pl.codegym.task.task04.task0414;

/* 
Liczba dni w roku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //String imie = bufferedReader.readLine();
        String sRok = bufferedReader.readLine();
        int nRok = Integer.parseInt(sRok);
        if (nRok % 400 == 0 )
        {
            int x = 366;
            System.out.println("Liczba dni w roku: " + x);
        }
        else if (nRok % 400 == 0 && nRok % 100 == 0 )
        {
            int x = 365;
            System.out.println(" Liczba dni w roku: " + x);
        }
        else if (nRok % 400 == 0 && nRok % 100 == 0 && nRok % 4 == 0 )
        {
            int x = 366;
            System.out.println(" Liczba dni w roku: " + x);
        }
        else
        {
            int x = 365;
            System.out.println(" Liczba dni w roku: " + x);
        }
    }
}