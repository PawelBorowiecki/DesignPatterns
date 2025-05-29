package org.example;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class AirMonitoring {
    private Set<Observer> observers;
    private double temperatureRatio, humidityRatio;

    public AirMonitoring() {
        temperatureRatio = Math.random() % 50;
        humidityRatio = Math.random() % 100;
        observers = new HashSet<>();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public String changeTemperatureRatio(){
        temperatureRatio = Math.random() % 50;
        Optional<Observer> ob =  observers.stream().filter(o -> TemperatureSensor.class.isInstance(o)).findFirst();
        if(ob.isPresent()){
            return ob.get().update(this);
        }
        return "Brak czujnika temperatury.";
    }

    public String changeHumidityRatio(){
        humidityRatio = Math.random() % 100;
        Optional<Observer> ob =  observers.stream().filter(o -> HumiditySensor.class.isInstance(o)).findFirst();
        if(ob.isPresent()){
            return ob.get().update(this);
        }
        return "Brak czujnika wilgotnosci.";
    }

}
