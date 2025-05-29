package org.example;

import java.util.UUID;

public class Volvo implements Car{
    private String vin;

    public Volvo(){
        vin = UUID.randomUUID().toString();
        System.out.println("Kreujemy Volvo.");
    }

    @Override
    public String getVin() {
        return vin;
    }
}
