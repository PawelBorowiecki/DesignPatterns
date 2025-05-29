package org.example;

public class Main {
    public static void main(String[] args) {
        Observer temperatureObserver = new TemperatureSensor();
        Observer humidityObserver = new HumiditySensor();
        AirMonitoring airMonitoring = new AirMonitoring();

        airMonitoring.attach(temperatureObserver);
        airMonitoring.attach(humidityObserver);
        System.out.println(airMonitoring.changeTemperatureRatio());
        System.out.println(airMonitoring.changeHumidityRatio());
    }
}