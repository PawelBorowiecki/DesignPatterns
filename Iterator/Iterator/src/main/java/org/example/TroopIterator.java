package org.example;

public interface TroopIterator {
    Troop getNext();
    boolean hasNext();
    void reset();
}
