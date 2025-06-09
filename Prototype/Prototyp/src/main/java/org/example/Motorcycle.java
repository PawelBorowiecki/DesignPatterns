package org.example;

public class Motorcycle extends Vehicle{
    private String drive;

    Motorcycle(double price, String licence, String gearbox, String model, String brand, String drive){
        super(price, licence, gearbox, model, brand);
        this.drive = drive;
    }

    Motorcycle(Motorcycle motorcycle){
        super(motorcycle);
        drive = motorcycle.drive;
    }

    @Override
    public Vehicle clone() {
        return new Motorcycle(this);
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is being driven.");
    }
}
