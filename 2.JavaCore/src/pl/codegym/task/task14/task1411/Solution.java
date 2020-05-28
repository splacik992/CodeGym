package pl.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
User, loser, coder i programmer
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true) {
            key = reader.readLine();
            if (key.equals("user"))
                person = new Person.User();
            else if (key.equals("loser"))
                person = new Person.Loser();
            else if (key.equals("coder"))
                person = new Person.Coder();
            else if (key.equals("programmer"))
                person = new Person.Programmer();
            else break;

            doWork(person);
        }
    }



    public static void doWork(Person person) {
        // Punkt 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Programmer) {
            ((Person.Programmer) person).enjoy();
        }
    }
}
