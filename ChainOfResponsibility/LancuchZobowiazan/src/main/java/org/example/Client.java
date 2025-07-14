package org.example;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new VehicleHandler();
        Handler h2 = new RentalHandler();
        h1.setNext(h2);
        h1.handle("add=1");
        h1.handle("add=2");
        h1.handle("delete=2");
        h1.handle("rent=1");
        h1.handle("return=1");
        h1.handle("zaden");
    }
}