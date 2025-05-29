package org.example;

public class BmwCreator extends CarCreator{
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
