package org.example;

public class CarFlyweight {
    private String brand;
    private String model;
    private String engine;

    public CarFlyweight(String brand, String model, String engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "CarFlyweight{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
