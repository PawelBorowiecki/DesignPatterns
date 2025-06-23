package org.example;

public class PaymentService {
    private PaymentMethod pm;

    public PaymentService(PaymentMethod pm) {
        this.pm = pm;
    }

    public void makeTransaction(String authData){
        pm.setAuthorizationData(authData);
        if(pm.checkAuthorizationData()){
            System.out.println("Platnosc przebiegla pomyslnie");
        }else{
            System.out.println("Podane dane sa nieprawidlowe.");
            cancelTransaction();
        }
    }

    public void cancelTransaction(){
        System.out.println("Transakcja zostala anulowana.");
        pm.reset();
    }
}
