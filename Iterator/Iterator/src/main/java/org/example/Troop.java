package org.example;

public class Troop {
    private String id;
    private String type;
    private int strength;

    public Troop(String id, String type, int strength) {
        this.id = id;
        this.type = type;
        this.strength = strength;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getStrength() {
        return strength;
    }
}
