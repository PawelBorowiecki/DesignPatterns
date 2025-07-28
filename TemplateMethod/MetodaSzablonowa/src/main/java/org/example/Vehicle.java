package org.example;

public abstract class Vehicle {
    public void prepareVehicle(){
        mountChassis();
        mountBody();
        insertEngine();
        startEngine();
        drive();
    }
    private void startEngine(){
        System.out.println("Uruchomiono silnik pojazdu.");
    }

    private void drive(){
        System.out.println("Pojazd jedzie.");
    }

    public abstract void mountChassis();
    public abstract void mountBody();
    public abstract void insertEngine();

}
