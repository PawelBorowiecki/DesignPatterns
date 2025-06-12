package org.example;

import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("a", "Kazimierz", 42);
        User u2 = new User("b", "Jan", 60);
        User u3 = new User("c", "Andrzej", 33);
        Database db = new UserDatabase(List.of(u1, u2, u3));
        Database dbProxy = new UserDatabaseProxy(db);
        DatabaseManager databaseManager = new DatabaseManager(dbProxy);
        List<User> allUsers = databaseManager.getAllElements();
        for(User u : allUsers){
            System.out.println(u.toString());
        }

        System.out.println(databaseManager.getElementInfo("a"));
    }
}