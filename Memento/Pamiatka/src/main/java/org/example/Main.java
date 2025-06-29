package org.example;

public class Main {
    public static void main(String[] args) {
        Telescope telescope = new RefractingTelescope();
        Caretaker caretaker = new Caretaker();
        telescope.setCoordinates(1.2, 4.9);
        caretaker.addMemento(telescope.save());
        telescope.setCoordinates(6.8, 2.3);
        caretaker.addMemento(telescope.save());
        telescope.setCoordinates(14.24, 76.99);
        caretaker.addMemento(telescope.save());
        caretaker.reclaim();
    }
}