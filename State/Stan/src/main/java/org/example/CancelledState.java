package org.example;

public class CancelledState implements State{
    private Order order;

    public CancelledState(Order order) {
        this.order = order;
    }

    @Override
    public void editOrder() {
        System.out.println("Nie mozna zmienic anulowanego zamowienia.");
    }

    @Override
    public void sendOrder() {
        System.out.println("Nie mozna wyslac anulowanego zamowienia.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Zamowienie zostalo anulowane.");
    }
}
