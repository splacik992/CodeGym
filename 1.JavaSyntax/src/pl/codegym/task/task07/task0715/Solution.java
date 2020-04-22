package pl.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Więcej Ala ma kota
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ala");
        list.add("As");
        list.add("ma");
        list.add("As");
        list.add("kota");
        list.add("As");


        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));

        }


    }
}