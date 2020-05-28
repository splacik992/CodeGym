package pl.codegym.task.task14.task1408;

/*
Ferma drobiu
*/

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

        static class HenFactory {

            static Hen getHen(String continent) {
                Hen hen = null;
                if(continent.equals("Europa")) {
                    hen = new EuropeanHen();
                } else if(continent.equals("Ameryka Północna")) {
                    hen = new NorthAmericanHen();
                } else if(continent.equals("Azja")) {
                    hen = new AsianHen();
                } else if(continent.equals("Afryka")) {
                    hen = new AfricanHen();
                }
                return hen;
            }
        }

    }
