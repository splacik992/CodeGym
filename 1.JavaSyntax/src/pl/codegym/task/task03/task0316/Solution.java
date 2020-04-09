package pl.codegym.task.task03.task0316;

/* 
Eskejpowanie znaków
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
            public static void main(String[] args) throws Exception {
            //tutaj wpisz swój kod
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int a = Integer.parseInt(reader.readLine());

            if(a>0){
                a = a*2;
                System.out.println(a);
            }else if(a<0){
                a = a+1;
                System.out.println(a);
            }else {
                System.out.println(0);
            }

        }}

