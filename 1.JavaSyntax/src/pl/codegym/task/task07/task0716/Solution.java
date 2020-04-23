package pl.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R czy L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("rosa"); // 0
        lista.add("luz"); // 1
        lista.add("lira"); // 2
        lista = napraw(lista);

        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> napraw(ArrayList<String> lista) {

        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).contains("r") && lista.get(i).contains("l")) {
                temp.add(lista.get(i));
            }
            if (!lista.get(i).contains("l") && !lista.get(i).contains("r")) {
                temp.add(lista.get(i));
            }
            if(lista.get(i).contains("l") && !lista.get(i).contains("r")){
                temp.add(lista.get(i));
                temp.add(lista.get(i));
            }
        }
        return temp;
    }
}