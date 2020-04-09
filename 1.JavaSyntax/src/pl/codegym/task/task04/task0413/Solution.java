package pl.codegym.task.task04.task0413;

/* 
Dzień tygodnia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int dzienTygodnia = Integer.parseInt(reader.readLine());

        if(dzienTygodnia == 1){
            System.out.println("Poniedzialek");
        }else if(dzienTygodnia == 2){
            System.out.println("Wtorek");
        }else if(dzienTygodnia == 3){
            System.out.println("Środa");
        }else if(dzienTygodnia == 4){
            System.out.println("Czwartek");
        }else if(dzienTygodnia == 5){
            System.out.println("Piątek");
        }else if(dzienTygodnia == 6){
            System.out.println("Sobota");
        }else if(dzienTygodnia == 7){
            System.out.println("Niedziela");
        }else{
            System.out.println("Nie ma takiego dnia tygodnia.");
        }
    }
}