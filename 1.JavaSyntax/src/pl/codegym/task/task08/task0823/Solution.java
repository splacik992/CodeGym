package pl.codegym.task.task08.task0823;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
Ruszamy na cały kraj
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[]ala=s.toCharArray();
        int n=ala.length;
        ala[0]=Character.toUpperCase(ala[0]);


        for (int i=0;i<n;i++){
            if(ala[i]==' '){

                ala[i+1]=Character.toUpperCase(ala[i+1]);
            }
        }
        for(char e:ala){
            System.out.print(e);
        }
    }
}