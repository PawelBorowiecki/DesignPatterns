package org.example;

public class Main {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new Card("1234");
        PaymentService paymentService = new PaymentService(paymentMethod);
        Client client = new Client(paymentService);
        client.pay();
    }
}