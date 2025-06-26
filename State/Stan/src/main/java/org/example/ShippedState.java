package org.example;

public class ShippedState implements State{
    private Order order;

    public ShippedState(Order order) {
        this.order = order;
    }

    @Override
    public void editOrder() {
        System.out.println("Nie mozna zmieniac wyslanego zamowienia.");
    }

    @Override
    public void sendOrder() {
        System.out.println("Zamowienie dostarczone.");
        order.changeState(new CompletedState(order));
    }

    @Override
    public void cancelOrder() {
        System.out.println("Anulowano zamowienie.");
        order.changeState(new CancelledState(order));
    }
}
