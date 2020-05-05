package pl.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Zmiana funkcjonalności
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty() || s == null) break;
            lista.add(s);
        }

        ArrayList<String> listaWielkimiLiterami = new ArrayList<String>();
        for (int i = 0; i < lista.size(); i++) {
            String s = lista.get(i);
            listaWielkimiLiterami.add(s.toUpperCase());


        }

        for (int i = 0; i < listaWielkimiLiterami.size(); i++) {
            if (listaWielkimiLiterami.get(i).length() % 2 == 0) {
                System.out.println(listaWielkimiLiterami.get(i) + " " + listaWielkimiLiterami.get(i));
            } else
                System.out.println(listaWielkimiLiterami.get(i) + " "
                        + listaWielkimiLiterami.get(i) + " "
                        + listaWielkimiLiterami.get(i));
        }
    }
}
