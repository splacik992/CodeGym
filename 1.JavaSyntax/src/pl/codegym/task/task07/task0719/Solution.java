package pl.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Wyświetl liczby w odwrotnej kolejności
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> integers = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(reader.readLine());
            integers.add(x);
        }

        for (int i = 9; i >=0 ;i--) {
            System.out.println(integers.get(i));
        }
    }
}
