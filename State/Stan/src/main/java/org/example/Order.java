package org.example;

public class Order {
    private State state;

    public Order() {
        state = new NewState(this);
    }

    public void changeState(State state){
        this.state = state;
    }

    public void edit(){
        state.editOrder();
    }

    public void send(){
        state.sendOrder();
    }

    public void cancel(){
        state.cancelOrder();
    }
}
