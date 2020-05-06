package pl.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Najmniejsza z N liczb
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> listaLiczbCalkowitych = getListaLiczbCalkowitych();
        System.out.println(getMinimum(listaLiczbCalkowitych));
}

    public static int getMinimum(List<Integer> array) {
        // Znajduje minimum
        int i = Collections.min(array);
        return i;
    }

    public static List<Integer> getListaLiczbCalkowitych() throws IOException {
        // Tworzy i inicjalizuje listę
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String end = reader.readLine();
        while (end != null ){
            arrayList.add(Integer.parseInt(end));

        }

        return arrayList;
    }
}
