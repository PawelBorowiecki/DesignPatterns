package org.example;

import java.util.UUID;

public class JetBuilder implements Builder{
    private Jet jet;

    public JetBuilder(){
        jet = new Jet();
    }

    @Override
    public void reset() {
        jet = new Jet();
    }

    @Override
    public void setId(String id) {
        jet.setId(id);
    }

    @Override
    public void setSeats(int seats) {
        jet.setSeats(seats);
    }

    @Override
    public void setEngineQuantity(int engineQuantity) {
        jet.setEngineQuantity(engineQuantity);
    }

    @Override
    public void setEngineType(String type) {
        jet.setEngineType(type);
    }

    public Jet getJet() {
        return jet;
    }
}
