package pl.codegym.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Lista tablic z liczbami
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> lista = utworzLista();
        printLista(lista);
    }

    public static ArrayList<int[]> utworzLista() {

        ArrayList<int[]> all = new ArrayList<int[]>();


        int [] a = new int[]{1, 2, 3, 4, 5};
        int [] b = new int[]{1,2};
        int [] c = new int []{1,2,3,3};
        int [] d = new int[]{2,2,2,2,2,2,2};
        int [] e = new int[]{};


        all.addAll(Arrays.asList(a));
        all.addAll(Arrays.asList(b));
        all.addAll(Arrays.asList(c));
        all.addAll(Arrays.asList(d));
        all.addAll(Arrays.asList(e));
        return all;
    }

    public static void printLista(ArrayList<int[]> lista) {
        for (int[] tablica : lista) {
            for (int x : tablica) {
                System.out.println(x);
            }
        }
    }
}
