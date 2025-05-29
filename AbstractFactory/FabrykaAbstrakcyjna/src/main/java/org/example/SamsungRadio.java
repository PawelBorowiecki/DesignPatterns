package org.example;

public class SamsungRadio implements Radio{
    @Override
    public void listen() {
        System.out.println("Samsung radio is being listened.");
    }
}
