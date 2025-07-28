package org.example;

public class Car extends Vehicle{
    @Override
    public void mountChassis() {
        System.out.println("Zamontowano podwozie samochodu z 4 kolami.");
    }

    @Override
    public void mountBody() {
        System.out.println("Zamontowano nadwozie samochodu wraz z karoseria.");
    }

    @Override
    public void insertEngine() {
        System.out.println("W samochodzie zamontowano silnik V8.");
    }
}
