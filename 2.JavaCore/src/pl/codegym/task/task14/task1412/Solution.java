package pl.codegym.task.task14.task1412;

/* 
Zaimplementuj metodę printMainInfo
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {

      

    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable,Drawable {

        public void draw() {
            System.out.println("Coś, co można narysować");
        }

        public void move() {
            System.out.println("Coś, co można ruszyć");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Coś, co można narysować");
        }

        public void move() {
            System.out.println("Coś, co można ruszyć");
        }
    }
}
