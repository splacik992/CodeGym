package pl.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Samogłoski i spółgłoski
*/

public class Solution {
    public static char[] samogloski = new char[]{'a', 'e', 'i', 'o', 'u'};
    public static ArrayList<Character> samo = new ArrayList<>();
    public static ArrayList<Character> spol = new ArrayList<>();


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char a[] = reader.readLine().toCharArray();

        for (int i = 0; i<a.length; i++) {
            isSamogloska(a[i]);
        }

        for (int i = 0; i<samo.size(); i++) {
            System.out.print(samo.get(i)+ " ");
        }

        System.out.println("");

        for (int i = 0; i<spol.size(); i++) {
            if (spol.get(i) != ' ') {
                System.out.print(spol.get(i) + " ");
            }
        }
    }

    // Ta metoda sprawdza, czy litera jest samogłoską
    public static boolean isSamogloska(char c) {
        c = Character.toLowerCase(c);  // Konwertuje na małe litery

        for (char d : samogloski)   // Szuka samogłosek w tablicy
        {
            if (c == d)
                return samo.add(c);
        }
        return spol.add(c);
    }
}
