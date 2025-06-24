package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    private List<Car> cars;

    public CarFactory(){
        cars = new ArrayList<>();
    }

    public Car createCar(String vin, String brand, String model, String engine){
        CarFlyweight carFlyweight = FlyweightFactory.getFlyweight(brand, model, engine);
        Car car = new Car(vin, carFlyweight);
        cars.add(car);
        return car;
    }
}
