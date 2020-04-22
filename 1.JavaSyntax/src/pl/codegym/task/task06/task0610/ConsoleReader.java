package pl.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Klasa ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        return a;
    }

    public static int readInt() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        return b;

    }

    public static double readDouble() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double c = Double.parseDouble(reader.readLine());
        return c;


    }

    public static boolean readBoolean() throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean ee = Boolean.parseBoolean(reader.readLine());
        return ee;
    }

    public static void main(String[] args) {

    }
}
