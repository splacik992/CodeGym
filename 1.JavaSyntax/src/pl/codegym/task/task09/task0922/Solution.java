package pl.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Jaka dzisiaj jest data?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dfInput = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = dfInput.parse(br.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        SimpleDateFormat dfOutput = new SimpleDateFormat("dd MMM yyyy",new Locale("pl"));
        System.out.println(dfOutput.format(date).toUpperCase());
    }
}
