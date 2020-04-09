package pl.codegym.task.task04.task0436;


/* 
Rysowanie prostokąta
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i=1; i<= n; i++ ) {
            for (int j=1; j<= m; j++ ) {
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}
