package org.example;

import java.util.UUID;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder newBuilder){
        builder = newBuilder;
    }

    public void makeAirplane(){
        builder.setId(UUID.randomUUID().toString());
        builder.setSeats(602);
        builder.setEngineQuantity(4);
        builder.setEngineType("Piston");
    }

    public void makeJet(){
        builder.setId(UUID.randomUUID().toString());
        builder.setSeats(2);
        builder.setEngineQuantity(2);
        builder.setEngineType("Turbine");
    }
}
