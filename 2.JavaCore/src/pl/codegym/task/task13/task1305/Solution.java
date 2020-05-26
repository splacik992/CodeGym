package pl.codegym.task.task13.task1305;

/* 
Cztery błędy
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
         Hobby HOBBY = new Hobby();
    }

    static class Hobby   implements Dream, Desire {
        public int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
