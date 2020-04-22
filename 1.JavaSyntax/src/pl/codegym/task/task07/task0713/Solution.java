package pl.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Granie w Javarellę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> lista3 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        ArrayList<Integer> pozostale = new ArrayList<Integer>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 20; j++) {
            lista.add(Integer.parseInt(r.readLine()));
        }

        for (int i = 0; i < lista.size(); i++) {
            boolean b = (lista.get(i) % 2 == 0 && lista.get(i) % 3 == 0);

            if (b) {
                lista2.add(lista.get(i));
                lista3.add(lista.get(i));
            } else if (lista.get(i) % 2 == 0) {
                lista2.add(lista.get(i));
            } else if (lista.get(i) % 3 == 0) {
                lista3.add(lista.get(i));
            } else {
                pozostale.add(lista.get(i));
            }
        }
        printLista(lista);
        printLista(lista2);
        printLista(lista3);
        printLista(pozostale);
    }

    public static void printLista(List<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }

}
