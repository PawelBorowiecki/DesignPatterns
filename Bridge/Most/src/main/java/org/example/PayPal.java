package org.example;

public class PayPal implements PaymentMethod{
    private String transferAuthId;
    private String authData;

    public PayPal(String transferAuthId) {
        this.transferAuthId = transferAuthId;
        authData = "";
    }

    @Override
    public void setAuthorizationData(String data) {
        authData = data;
    }

    @Override
    public boolean checkAuthorizationData() {
        return transferAuthId.equals(authData);
    }

    @Override
    public void reset() {
        authData = "";
    }
}
