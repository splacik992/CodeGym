package pl.codegym.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
Zapisywanie do pliku z konsoli
*/

public class Solution {
    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileWriter writer = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        String text = "";

        while (!"exit".equals(text)) {
            text = reader.readLine();
            writer.write(text + "\n");

        }
        bufferedWriter.close();
    }
}