package pl.codegym.task.task04.task0419;

/* 
Największa z czterech liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        if (a > b & a > c & a > d){
            System.out.println(a);
        }
        else if (b > a & b > c & b > d){
            System.out.println(b);
        }
        else if (c > a & c > b & c > d){
            System.out.println(c);
        }
        else if (d > a & d > b & d > a){
            System.out.println(d);
        }
        else if ((a >= b ) & (a == c ||  a == d)){
            System.out.println(a);
        }
        else if ((a >= c ) & (a == b || a == d)){
            System.out.println(a);
        }
        else if (( a >= d) & (a == c || a == b)){
            System.out.println(a);
        }
        else if ((b >= a ) & (b == c ||  b == d)){
            System.out.println(b);
        }
        else if ((b >= c ) & (b == b || b == d)){
            System.out.println(b);
        }
        else if ((b >= d) & (b == c || b == b)){
            System.out.println(b);
        }

    }
}

