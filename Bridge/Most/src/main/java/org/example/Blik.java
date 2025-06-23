package org.example;

public class Blik implements PaymentMethod{
    private String transferAuthId;
    private String authData;

    public Blik(String transferAuthId) {
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
