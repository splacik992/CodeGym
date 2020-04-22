package pl.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Poprawianie funkcjonalności
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());


        int minimum = min(a, b,c,d,e);

        System.out.println("Minimum = " + minimum);

        int [] arr = {a,b,c,d,e};

        for (int i = 0; i <arr.length ; i++) {

            System.out.println(arr[arr.length - i - 1]);
        }
    }


    public static int min(int a, int b, int c, int d, int e) {
        int [] arr = {a,b,c,d,e};
        int m = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < m)
                m = arr[i];
        }
        return m;
    }
}
