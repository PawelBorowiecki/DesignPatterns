package org.example;

public class AudiCreator extends CarCreator{
    @Override
    public Car createCar() {
        return new Audi();
    }
}
