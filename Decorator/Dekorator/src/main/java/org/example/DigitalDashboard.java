package org.example;

public class DigitalDashboard extends CarAccessoryDecorator{
    public DigitalDashboard(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        String result = super.getDescription();
        result += " z cyfrowa deska rozdzielcza.";
        return result;
    }
}
