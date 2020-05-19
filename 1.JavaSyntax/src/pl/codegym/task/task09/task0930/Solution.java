package pl.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            lista.add(s);
        }

        String[] tablica = lista.toArray(new String[lista.size()]);
        sortuj(tablica);

        for (String x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] tablica) {
        ArrayList<Integer> liczby = new ArrayList<>();
        ArrayList<String> wyrazy = new ArrayList<>();

        for (String x : tablica){
            if (isLiczba(x))
                liczby.add(Integer.parseInt(x));
            else
                wyrazy.add(x);
        }

        Collections.sort(liczby, Collections.reverseOrder());

        for (int i = 0; i < wyrazy.size(); i++)
        {
            for (int j = 0; j < wyrazy.size() - 1; j++)
            {
                String pom;

                if (isWiekszeOd(wyrazy.get(j), wyrazy.get(j + 1)))
                {
                    pom = wyrazy.get(j);
                    wyrazy.set(j, wyrazy.get(j + 1));
                    wyrazy.set(j + 1, pom);
                }
            }
        }

        int licznikLiczby = 0;
        int licznikWyrazy = 0;

        for (int i = 0; i < tablica.length; i ++)
        {
            if (isLiczba(tablica[i]))
            {
                tablica[i] = Integer.toString(liczby.get(licznikLiczby));
                licznikLiczby++;
            }
            else
            {
                tablica[i] = wyrazy.get(licznikWyrazy);
                licznikWyrazy++;
            }
        }


    }

    // Metoda porównywania ciągów: 'a' jest większe niż 'b'
    public static boolean isWiekszeOd(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Czy przekazywany ciąg jest liczbą?
    public static boolean isLiczba(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Ciąg zawiera łącznik
                    || (!Character.isDigit(c) && c != '-') // lub nie jest liczbą i nie zaczyna się łącznikiem
                    || (i == 0 && c == '-' && chars.length == 1)) // lub jest pojedynczym łącznikiem
            {
                return false;
            }
        }
        return true;
    }
}
