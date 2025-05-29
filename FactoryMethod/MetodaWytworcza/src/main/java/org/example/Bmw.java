package org.example;

import java.util.UUID;

public class Bmw implements Car{
    private String vin;

    public Bmw(){
        vin = UUID.randomUUID().toString();
        System.out.println("Kreujemy BMW.");
    }

    @Override
    public String getVin() {
        return vin;
    }
}
