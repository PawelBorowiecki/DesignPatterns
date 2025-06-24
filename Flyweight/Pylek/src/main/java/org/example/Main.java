package org.example;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        System.out.println("Wyprodukowano pojazd: " + carFactory.createCar(UUID.randomUUID().toString(), "Volvo", "XC90", "V8").toString());
        System.out.println("Wyprodukowano pojazd: " + carFactory.createCar(UUID.randomUUID().toString(), "Volvo", "XC90", "V8"));
        System.out.println("Wyprodukowano pojazd: " + carFactory.createCar(UUID.randomUUID().toString(), "Volvo", "XC90", "V8"));
        System.out.println("Wyprodukowano pojazd: " + carFactory.createCar(UUID.randomUUID().toString(), "BMW", "X6", "V6"));
        System.out.println("Wyprodukowano pojazd: " + carFactory.createCar(UUID.randomUUID().toString(), "BMW", "X6", "V6"));
        System.out.println("Wyprodukowano pojazd: " + carFactory.createCar(UUID.randomUUID().toString(), "BMW", "X6", "V6"));
        System.out.println("Wyprodukowano pojazd: " + carFactory.createCar(UUID.randomUUID().toString(), "KIA", "Sorento", "V6"));
        System.out.println("Wyprodukowano pojazd: " + carFactory.createCar(UUID.randomUUID().toString(), "KIA", "Sorento", "V6"));
        System.out.println("Wyprodukowano pojazd: " + carFactory.createCar(UUID.randomUUID().toString(), "KIA", "Sorento", "V6"));
    }
}