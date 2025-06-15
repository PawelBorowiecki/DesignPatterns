package org.example;

public class Main {
    public static void main(String[] args) {
        Pound pounds = new Pound(59);
        Euro euros = new Euro(50);
        MoneyConverter euroConverter = new EuroAdapter(euros);
        System.out.println("Funty: " + pounds.getQuantity());
        System.out.println("Euro: " + euros.getQuantity());
        System.out.println("Czy ilosc euro i funtow jest identyczna: " + pounds.isSameQuantityInEuro(euroConverter, 1.18));
    }
}