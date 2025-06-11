package org.example;

public class NavyIterator implements TroopIterator{
    private Navy navy;
    private String type;
    private int currentPosition;

    public NavyIterator(Navy navy, String type) {
        this.navy = navy;
        this.type= type;
        this.currentPosition = 0;
    }

    @Override
    public Troop getNext() {
        if(!hasNext()){
            return null;
        }
        if(!(navy.getTroops().get(currentPosition).getType().equals(type))){
            currentPosition++;
            return null;
        }
        return navy.getTroops().get(currentPosition++);
    }

    @Override
    public boolean hasNext() {
        return currentPosition < navy.getTroops().size();
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
