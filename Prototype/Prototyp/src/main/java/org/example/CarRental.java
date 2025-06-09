package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Car carPrototype = new Car(3000, "B", "Manual", "X6", "BMW", "Kombi");
        Bus busPrototype = new Bus(5000, "D", "Automatic", "Lion", "MAN", 44);
        Truck truckPrototype = new Truck(7000, "C+E", "Manual", "589", "Peterbilt", 72000,  5);
        Motorcycle motorcyclePrototype = new Motorcycle(2000, "A", "Manual", "Gray Ghost", "Harley Davidson", "chain");

        for(int i = 0; i < 5; i++){
            vehicles.add(carPrototype.clone());
            vehicles.add(busPrototype.clone());
            vehicles.add(truckPrototype.clone());
            vehicles.add(motorcyclePrototype.clone());
        }

        for(Vehicle v : vehicles){
            v.drive();
        }
    }
}