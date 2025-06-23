package org.example;

public class Card implements PaymentMethod{
    private String pin;
    private String authData;

    public Card(String pin) {
        this.pin = pin;
        authData = "";
    }

    @Override
    public void setAuthorizationData(String data) {
        authData = data;
    }

    @Override
    public boolean checkAuthorizationData() {
        return pin.equals(authData);
    }

    @Override
    public void reset() {
        authData = "";
    }
}
