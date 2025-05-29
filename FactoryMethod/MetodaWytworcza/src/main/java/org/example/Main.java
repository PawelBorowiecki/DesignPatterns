package org.example;

public class Main {
    public static void main(String[] args) {
        BmwCreator bmwCreator = new BmwCreator();
        AudiCreator audiCreator = new AudiCreator();
        VolvoCreator volvoCreator = new VolvoCreator();
        Car bmw = bmwCreator.createCar();
        Car audi = audiCreator.createCar();
        Car volvo = volvoCreator.createCar();
        System.out.println("Nr VIN BMW: " + bmw.getVin());
        System.out.println("Nr VIN Audi: " + audi.getVin());
        System.out.println("Nr VIN Volvo: " + volvo.getVin());
    }
}