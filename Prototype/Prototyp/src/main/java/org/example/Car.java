package org.example;

public class Car extends Vehicle{
    private String type;

    Car(double price, String licence, String gearbox, String model, String brand, String type){
        super(price, licence, gearbox, model, brand);
        this.type = type;
    }

    Car(Car car){
        super(car);
        type = car.type;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public void drive() {
        System.out.println("Car is being driven.");
    }
}
