package pl.codegym.task.task09.task0918;

/* 
Wszyscy są naszymi kumplami, nawet wyjątki
*/

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.rmi.RemoteException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends RemoteException {
    }

    static class MyException2 extends IOException {
    }

    static class MyException3 extends NullPointerException{
    }

    static class MyException4 extends IndexOutOfBoundsException {
    }
}

