package org.example;

public interface Builder {
    void reset();
    void setId(String id);
    void setSeats(int seats);
    void setEngineQuantity(int engineQuantity);
    void setEngineType(String type);
}
