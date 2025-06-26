package org.example;

public class ReadyState implements State{
    private Order order;

    public ReadyState(Order order) {
        this.order = order;
    }

    @Override
    public void editOrder() {
        System.out.println("Zamowienie jest przygotowywane ponownie.");
        order.changeState(new InPreparationState(order));
    }

    @Override
    public void sendOrder() {
        System.out.println("Wyslano zamowienie.");
        order.changeState(new ShippedState(order));
    }

    @Override
    public void cancelOrder() {
        System.out.println("Anulowano zamowienie.");
        order.changeState(new CancelledState(order));
    }
}
