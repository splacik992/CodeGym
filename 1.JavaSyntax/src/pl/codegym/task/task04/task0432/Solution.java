package pl.codegym.task.task04.task0432;



/* 
Dobrego nigdy zbyt wiele
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String wyraz = reader.readLine();
        int licznik = Integer.parseInt(reader.readLine());
        int a = 0;
        while(a < licznik){
            System.out.println(wyraz);
            a++;
        }
        }

}
