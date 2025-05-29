package org.example;

public class VolvoCreator extends CarCreator{
    @Override
    public Car createCar() {
        return new Volvo();
    }
}
