package pl.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Aktualizacja oprogramowania
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Lista adresów
        HashMap<String,String> miasta = new HashMap<>();

        while (true) {
            String miasto = reader.readLine();
            if (miasto != null && miasto.isEmpty()) break;
            String rodzina = reader.readLine();

            miasta.put(miasto,rodzina);
        }

        String miasto = reader.readLine();
        System.out.println(miasta.get(miasto));

    }
}
