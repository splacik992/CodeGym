package pl.codegym.task.task08.task0810;

import java.sql.Time;
import java.util.*;

/* 
Czas na 10000 wywołań get
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCzasGetWms(zapelnij(new ArrayList())));
        System.out.println(getCzasGetWms(zapelnij(new LinkedList())));
    }

    public static List zapelnij(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.add(new Object());
        }
        return lista;
    }

    public static long getCzasGetWms(List lista) {
        // tutaj wpisz swój kod
        long miliSeconds = System.currentTimeMillis();
        get10000(lista);

        long executionTime = System.currentTimeMillis() - miliSeconds;
        // tutaj wpisz swój kod

        return executionTime;
    }

    public static void get10000(List lista) {
        if (lista.isEmpty()) return;
        int x = lista.size() / 2;

        for (int i = 0; i < 10000; i++) {
            lista.get(x);
        }
    }
}
