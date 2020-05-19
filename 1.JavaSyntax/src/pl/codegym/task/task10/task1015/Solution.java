package pl.codegym.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Tablica z listami ciągów
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] tablicaCiagowList = utworzList();
        printList(tablicaCiagowList);
    }

    public static ArrayList<String>[] utworzList() {

        String[] a = {"aa"};
        String[] b = {"bb"};
        ArrayList[] aa = new ArrayList[0];

        return aa;
    }

    public static void printList(ArrayList<String>[] tablicaCiagowList) {
        for (ArrayList<String> lista : tablicaCiagowList) {
            for (String s : lista) {
                System.out.println(s);
            }
        }
    }
}