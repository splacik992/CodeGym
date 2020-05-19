package pl.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Liczba liter
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alfabet
        String abc = "aąbcćdeęfghijklłmnńoóprsśtuwyzźż";
        char[] abcTablica = abc.toCharArray();

        ArrayList<Character> alfabet = new ArrayList<>();
        for (char litera : abcTablica) {
            alfabet.add(litera);
        }

        // Czyta ciągi
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lista.add(s.toLowerCase());
        }

        // tutaj wpisz swój kod

        int[] ilosc = new int[abc.length()];

        for (int pS=0;pS<10;pS++) {
            String aktualnyS = lista.get(pS);
            for (int x=0;x<aktualnyS.length();x++) {
                char litera = aktualnyS.charAt(x);

                if (abc.contains(String.valueOf(litera))) {
                    for (int i = 0; i < abc.length(); i++)
                        if (litera == abcTablica[i])
                            ilosc[i]++;
                }
            }
        }

        for(int i=0;i<abcTablica.length;i++)
            System.out.println(abcTablica[i]+" "+ilosc[i]);
    }
}