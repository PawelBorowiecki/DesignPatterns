package org.example;

import java.util.UUID;

public class AirplaneBuilder implements Builder{
    private Airplane airplane;

    public AirplaneBuilder() {
        airplane = new Airplane();
    }

    @Override
    public void reset() {
        airplane = new Airplane();
    }

    @Override
    public void setId(String id) {
        airplane.setId(id);
    }

    @Override
    public void setSeats(int seats) {
        airplane.setSeats(seats);
    }

    @Override
    public void setEngineQuantity(int engineQuantity) {
        airplane.setEngineQuantity(engineQuantity);
    }

    @Override
    public void setEngineType(String type) {
        airplane.setEngineType(type);
    }

    public Airplane getAirplane(){
        return airplane;
    }
}
