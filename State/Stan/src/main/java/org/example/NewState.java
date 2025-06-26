package org.example;

public class NewState implements State{
    private Order order;

    public NewState(Order order) {
        this.order = order;
    }

    @Override
    public void editOrder() {
        System.out.println("Zamowienie jest przygotowywane.");
        order.changeState(new InPreparationState(order));
    }

    @Override
    public void sendOrder() {
        System.out.println("Nie mozna wyslac niegotowego zamowienia.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Anulowano zamowienie.");
        order.changeState(new CancelledState(order));
    }
}
