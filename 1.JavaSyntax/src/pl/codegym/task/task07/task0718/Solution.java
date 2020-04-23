package pl.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Sprawdzanie kolejności
*/

    public class Solution {
        public static void main(String[] args) throws IOException {
            //tutaj wpisz swój kod

            Scanner sc = new Scanner(System.in);

            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                list.add(sc.nextLine());
            }


            for (int i = 0; i < 10; i++) {


                if (i < 9) {
                    if (list.get(i).length() > list.get(i + 1).length()) {

                        System.out.println(list.indexOf(list.get(i + 1)));
                        break;

                    }
                }
            }
        }
    }


