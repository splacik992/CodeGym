package pl.codegym.task.task14.task1415;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* 
Usługi sprzątające
*/

public class Solution {
    public static void main(String[] args) throws NoSuchMethodException {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);

    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        // Napisz tutaj swoją implementację Punktów 1-4
        ArrayList<Apartment> apart = new ArrayList<>();

        if(apartments == new OneRoomApt())){

        }

    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        static void clean1Room() {
            System.out.println("Posprzątano 1 pokój");
        }
    }

    static class TwoRoomApt implements Apartment {
        static void clean2Rooms() {
            System.out.println("Posprzątano 2 pokoje");
        }
    }

    static class ThreeRoomApt implements Apartment {
        static void clean3Rooms() {
            System.out.println("Posprzątano 3 pokoje");
        }
    }
}
