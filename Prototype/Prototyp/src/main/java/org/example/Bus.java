package org.example;

public class Bus extends Vehicle{
    private int seats;

    Bus(double price, String licence, String gearbox, String model, String brand, int seats){
        super(price, licence, gearbox, model, brand);
        this.seats = seats;
    }

    Bus(Bus bus){
        super(bus);
        seats = bus.seats;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

    @Override
    public void drive() {
        System.out.println("Bus is being driven.");
    }
}
