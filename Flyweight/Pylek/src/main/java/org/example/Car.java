package org.example;

public class Car {
    private String vin;
    private CarFlyweight carFlyweight;

    public Car(String id, CarFlyweight carFlyweight) {
        this.vin = id;
        this.carFlyweight = carFlyweight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", carFlyweight=" + carFlyweight +
                '}';
    }
}
