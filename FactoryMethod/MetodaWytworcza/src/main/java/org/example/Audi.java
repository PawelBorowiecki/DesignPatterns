package org.example;

import java.util.UUID;

public class Audi implements Car{
    private String vin;

    public Audi(){
        vin = UUID.randomUUID().toString();
        System.out.println("Kreujemy Audi.");
    }

    @Override
    public String getVin() {
        return vin;
    }
}
