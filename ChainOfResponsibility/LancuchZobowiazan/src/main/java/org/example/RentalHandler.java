package org.example;

public class RentalHandler implements Handler{
    private Handler next;

    public RentalHandler(){}

    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public void handle(String request) {
        String[] params = request.split("=");
        if(params[0].equals("rent")){
            rentVehicle(params[1]);
        }else if(params[0].equals("return")){
            returnVehicle(params[1]);
        }else if(next != null){
            next.handle(request);
        }
    }

    private void rentVehicle(String id){
        System.out.println("Wypozyczono pojazd o id: " + id);
    }
    private void returnVehicle(String id){
        System.out.println("Zwrocono pojazd o id: " + id);
    }
}
