package pl.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Słowa na odwrót
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            int x = Integer.parseInt(reader.readLine());
            arrayList.add(String.valueOf(x));
        }

        arrayList.remove(2);

        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(0));

    }
}



