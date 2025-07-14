package org.example;

public class VehicleHandler implements Handler{
    private Handler next;

    public VehicleHandler(){}

    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public void handle(String request) {
        String[] params = request.split("=");
        if(params[0].equals("add")){
            addVehicle(params[1]);
        }else if(params[0].equals("delete")){
            deleteVehicle(params[1]);
        }else if(next != null){
            next.handle(request);
        }
    }
    private void addVehicle(String id){
        System.out.println("Dodano pojazd o id: " + id);
    }
    private void deleteVehicle(String id){
        System.out.println("Usunieto pojazd o id: " + id);
    }
}
