package org.example;

public class CompletedState implements State{
    private Order order;

    public CompletedState(Order order) {
        this.order = order;
    }

    @Override
    public void editOrder() {
        System.out.println("Nie mozna zmienic zrealizowanego zamowienia.");
    }

    @Override
    public void sendOrder() {
        System.out.println("Nie mozna wyslac zrealizowanego zamowienia.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Nie mozna anulowac zrealizowanego zamowienia.");
    }
}
