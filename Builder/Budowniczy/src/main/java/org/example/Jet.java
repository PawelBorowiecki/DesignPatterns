package org.example;

public class Jet {
    private String id;
    private int seats;
    private int engineQuantity;
    private String engineType;

    public Jet(){}

    public void setId(String id) {
        this.id = id;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngineQuantity(int engineQuantity) {
        this.engineQuantity = engineQuantity;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "id='" + id + '\'' +
                ", seats=" + seats +
                ", engineQuantity=" + engineQuantity +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
