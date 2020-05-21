package pl.codegym.task.task12.task1220;

/* 
Klasa Human i interfejsy CanRun i CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanRun{
        void run();
    }

    public interface CanSwim{
        void swim();
    }

    public abstract class Human implements CanRun,CanSwim{

    }
    // Add public interfaces and a public class here
}
