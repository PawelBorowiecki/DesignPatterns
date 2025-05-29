package org.example;

public class HumiditySensor implements Observer{
    @Override
    public String update(AirMonitoring monitoring) {
        return "Nastapila zmiana wilgotnosci.";
    }
}
