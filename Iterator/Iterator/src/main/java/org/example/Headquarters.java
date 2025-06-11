package org.example;

public class Headquarters {
    private Commander commander;

    public Headquarters(Commander commander) {
        this.commander = commander;
    }

    public void giveOrdersToRangers(){
        commander.giveOrders("Rangers", "Rozpoczac operacje Kobra.");
    }

    public void giveOrdersToInfantrymen(){
        commander.giveOrders("Infantrymen", "Przegrupowac sie.");
    }
}
