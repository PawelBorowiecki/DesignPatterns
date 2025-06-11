package org.example;

import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Troop troop1 = new Troop(UUID.randomUUID().toString(), "Rangers", 30);
        Troop troop2 = new Troop(UUID.randomUUID().toString(), "Infantrymen", 100);
        Troop troop3 = new Troop(UUID.randomUUID().toString(), "Infantrymen", 200);
        Army navy = new Navy(List.of(troop1, troop2, troop3));
        Commander commander = new Commander(navy);
        Headquarters headquarters = new Headquarters(commander);
        headquarters.giveOrdersToRangers();
        headquarters.giveOrdersToInfantrymen();
    }
}