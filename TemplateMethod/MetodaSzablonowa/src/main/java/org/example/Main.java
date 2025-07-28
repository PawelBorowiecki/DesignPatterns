package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        car.prepareVehicle();
        motorcycle.prepareVehicle();
    }
}