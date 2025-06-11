package org.example;

public class Commander {
    private Army army;
    private TroopIterator iterator;

    public Commander(Army army) {
        this.army = army;
    }

    public void giveOrders(String troopType, String order){
        if(troopType.equals("Rangers")){
            iterator = army.createRangersIterator();
            while(iterator.hasNext()){
                Troop troop = iterator.getNext();
                if(troop != null){
                    System.out.println("Id: " +  troop.getId() + ". Typ jednostki: " + troop.getType() + ". Liczebnosc oddzialu: " + troop.getStrength() + ". Rozkaz: " + order);
                }
            }
            iterator.reset();
        }else if(troopType.equals("Infantrymen")){
            iterator = army.createInfantrymenIterator();
            while(iterator.hasNext()){
                Troop troop = iterator.getNext();
                if(troop != null){
                    System.out.println("Id: " +  troop.getId() + ". Typ jednostki: " + troop.getType() + ". Liczebnosc oddzialu: " + troop.getStrength() + ". Rozkaz: " + order);
                }
            }
            iterator.reset();
        }
    }
}
