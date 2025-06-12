package org.example;

import java.util.List;

public class DatabaseManager {
    private Database db;

    public DatabaseManager(Database db) {
        this.db = db;
    }

    public List<User> getAllElements(){
        return db.listElements();
    }

    public String getElementInfo(String elementId){
        return db.geElementInfo(elementId);
    }
}
