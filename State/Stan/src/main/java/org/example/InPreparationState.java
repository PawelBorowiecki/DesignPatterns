package org.example;

public class InPreparationState implements State{
    private Order order;

    public InPreparationState(Order order) {
        this.order = order;
    }

    @Override
    public void editOrder() {
        System.out.println("Zakonczono przygotowanie zamowienia.");
        order.changeState(new ReadyState(order));
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
