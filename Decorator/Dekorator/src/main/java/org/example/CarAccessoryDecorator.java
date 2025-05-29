package org.example;

public class CarAccessoryDecorator implements Car{
    private Car wrappee;

    public CarAccessoryDecorator(Car car) {
        this.wrappee = car;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription();
    }
}
