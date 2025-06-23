package org.example;

public interface PaymentMethod {
    void setAuthorizationData(String data);
    boolean checkAuthorizationData();
    void reset();
}
