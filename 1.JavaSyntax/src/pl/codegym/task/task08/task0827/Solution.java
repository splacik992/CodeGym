package pl.codegym.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Praca z datami
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDataNieparzysta("MAY 1 2013"));
    }

    public static boolean isDataNieparzysta(String date) {
        Date date1 = new Date(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);

        int i = cal.DAY_OF_YEAR;
        if (i % 2 != 0)
            return true;
        else
            return false;
    }
}
