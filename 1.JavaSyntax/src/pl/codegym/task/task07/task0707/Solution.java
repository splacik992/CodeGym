package pl.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
Co to za rodzaj listy?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        ArrayList<String> list = new ArrayList<>();

        list.add("mama");
        list.add("tata");
        list.add("wujek");
        list.add("ciocia");
        list.add("brat");

        System.out.println(list.size());

        for (String listElement : list) {
            System.out.println(listElement);
        }
    }
}
