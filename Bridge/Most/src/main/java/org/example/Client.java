package org.example;

import java.util.Scanner;

public class Client {
    private PaymentService ps;

    public Client(PaymentService ps) {
        this.ps = ps;
    }

    public void pay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dane uwierzytelniajace platnosc: ");
        String paymentAuthId = scanner.next();
        ps.makeTransaction(paymentAuthId);
    }
}
