package pl.codegym.task.task13.task1306;

/* 
Błędy w initializeIdAndName
*/

public class Solution{

        public static void main(String[] args) throws Exception {
            System.out.println(Matrix.NEO);
            System.out.println(Matrix.TRINITY);
        }

static class Matrix {
    public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
}

interface DBObject {
    User initializeIdAndName(long id, String name);
}

static class User implements DBObject {
    long id;
    String name;

    public User initializeIdAndName(long id, String name) {
        this.name = name;
        return new User();
    }

    @Override
    public String toString() {
        return String.format("Imię użytkownika to %s, id = %d", name, id);
    }
}
}