package pl.codegym.task.task13.task1326;

/* 
Sortowanie liczb parzystych z pliku
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream Enter = new FileInputStream(fileName);
        BufferedReader StreamReader = new BufferedReader(new InputStreamReader(Enter));
        ArrayList<Integer> lista = new ArrayList<>();
        String temp = "";
        while ((temp = StreamReader.readLine()) != null) {
            int temp1 = Integer.parseInt(temp);
            lista.add(temp1);
        }
        Enter.close();

        ArrayList<Integer> sorted = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                sorted.add(lista.get(i));
            }
        }
        Collections.sort(sorted);

        for (Integer s : sorted
        ) {
            System.out.println(s);

        }
    }
}

