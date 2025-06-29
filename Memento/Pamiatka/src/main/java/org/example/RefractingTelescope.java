package org.example;

import org.javatuples.Pair;

public class RefractingTelescope implements Telescope{
    private Pair<Double, Double> coordinates;

    public RefractingTelescope() {
        coordinates = new Pair<>(0.0, 0.0);
    }

    @Override
    public Memento save() {
        System.out.println("Zapisano wspolrzedne.");
        return new CoordinatesMemento(this, coordinates);
    }

    @Override
    public void setCoordinates(Double x, Double y) {
        coordinates.setAt0(x);
        coordinates.setAt1(y);
    }
}
