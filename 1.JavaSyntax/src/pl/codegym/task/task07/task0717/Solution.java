package pl.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Duplikowanie słów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Czyta ciągi z konsoli i deklaruje tutaj ArrayList
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String x = reader.readLine();
            list.add(x);
        }


        ArrayList<String> wynik = doubleValues(list);

        for (String wynik2: wynik) {
            System.out.println(wynik2);
        }
        // Wyświetla wynik
    }

    public static ArrayList<String> doubleValues(ArrayList<String> lista) {
        //tutaj wpisz swój kod
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i <lista.size() ; i++) {
            arrayList.add(lista.get(i));
            arrayList.add(lista.get(i));
        }
        return arrayList;
    }
}
