package pl.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

/* 
Metoda w try-catch
*/

public class Solution {
    public static void main(String[] args) {


        czytajDane();

    }

    public static void czytajDane() {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> dupa = new ArrayList<>();

        while (true) {
            try {
                int i = Integer.parseInt(reader.readLine());
                dupa.add(i);
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }catch (NumberFormatException z){
                for (Integer list: dupa
                     ) {
                    System.out.println(list);
                }
                break;
            }
        }
    }
}
