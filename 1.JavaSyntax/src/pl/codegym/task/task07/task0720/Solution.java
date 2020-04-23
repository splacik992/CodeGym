package pl.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Przestawiono w samą porę
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());


        for (int j = 0; j < n; j++) {
            String s = reader.readLine();
            arrayList.add(s);
        }

        for (int j = 0; j < m; j++) {

            arrayList.add(arrayList.get(0));
            arrayList.remove(0);
        }

        for (String wynik: arrayList) {

            System.out.println(wynik);
        }
    }
}

