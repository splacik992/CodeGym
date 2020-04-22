package pl.codegym.task.task05.task0528;

/* 
Wyświetl dzisiejszą datę
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        String pattern = "MM dd yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String date = dateFormat.format(new Date());
        System.out.println(date);
    }
}
