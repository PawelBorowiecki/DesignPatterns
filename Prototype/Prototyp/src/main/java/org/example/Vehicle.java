package org.example;

public abstract class Vehicle {
    private double price;
    private String licence, gearbox, model, brand;

    public Vehicle(double price, String licence, String gearbox, String model, String brand) {
        this.price = price;
        this.licence = licence;
        this.gearbox = gearbox;
        this.model = model;
        this.brand = brand;
    }

    public Vehicle(Vehicle vehicle){
        price = vehicle.price;
        licence = vehicle.licence;
        gearbox = vehicle.gearbox;
        model = vehicle.model;
        brand = vehicle.brand;
    }

    public abstract Vehicle clone();

    public abstract void drive();
}
