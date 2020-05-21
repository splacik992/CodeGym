package pl.codegym.task.task12.task1226;

/* 
Wspinaj się, lataj i biegaj
*/

public class Solution {

    public interface CanFly{
        void fly();
    }

    public interface CanClimb{
        void climb();
    }

    public interface CanRun{
        void run();
    }
    public static void main(String[] args) {

    }

    public class Cat implements CanRun,CanClimb{
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements CanRun{
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
        @Override
        public void climb() {
            super.climb();
        }

        @Override
        public void run() {
            super.run();
        }
    }

    public class Duck implements CanRun,CanFly{
        @Override
        public void fly() {

        }


        @Override
        public void run() {

        }
    }
}
