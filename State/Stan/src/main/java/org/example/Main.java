package org.example;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.edit();
        order1.send();
        order1.edit();
        order1.send();
        order1.cancel();
        Order order2 = new Order();
        order2.edit();
        order2.cancel();
    }
}