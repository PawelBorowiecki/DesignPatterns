package org.example;

public class Motorcycle extends Vehicle{
    @Override
    public void mountChassis() {
        System.out.println("Zamontowano podwozie motocykla z 2 kolami.");
    }

    @Override
    public void mountBody() {
        System.out.println("Zamontowano nadwozie motocykla z rama typu Delta.");
    }

    @Override
    public void insertEngine() {
        System.out.println("W motocyklu zamontowano silnik R2.");
    }
}
