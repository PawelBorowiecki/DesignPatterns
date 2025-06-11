package org.example;

import java.util.List;

public class Navy implements Army{
    private List<Troop> troops;

    public Navy(List<Troop> troops) {
        this.troops = troops;
    }

    public List<Troop> getTroops() {
        return troops;
    }

    @Override
    public TroopIterator createRangersIterator() {
        return new NavyIterator(this, "Rangers");
    }

    @Override
    public TroopIterator createInfantrymenIterator() {
        return new NavyIterator(this, "Infantrymen");
    }
}
