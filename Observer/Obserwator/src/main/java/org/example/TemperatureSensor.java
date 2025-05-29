package org.example;

public class TemperatureSensor implements Observer{
    @Override
    public String update(AirMonitoring monitoring) {
        return "Nastapila zmiana temperatury";
    }
}
