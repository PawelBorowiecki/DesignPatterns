package org.example;

public class Truck extends Vehicle{
    private double load;
    private int axleQuantity;

    Truck(double price, String licence, String gearbox, String model, String brand, double load, int axleQuantity){
        super(price, licence, gearbox, model, brand);
        this.load = load;
        this.axleQuantity = axleQuantity;
    }

    Truck(Truck truck){
        super(truck);
        load = truck.load;
        axleQuantity = truck.axleQuantity;
    }

    @Override
    public Vehicle clone() {
        return new Truck(this);
    }

    @Override
    public void drive() {
        System.out.println("Truck is being driven.");
    }
}
