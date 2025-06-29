package org.example;

import org.javatuples.Pair;

public class CoordinatesMemento implements Memento{
    private Telescope telescope;
    private Pair<Double, Double> coordinates;

    public CoordinatesMemento(Telescope telescope, Pair<Double, Double> coordinates) {
        this.telescope = telescope;
        this.coordinates = coordinates;
    }

    @Override
    public void restore() {
        telescope.setCoordinates(coordinates.getValue0(), coordinates.getValue1());
    }
}
