package org.example;

public class LgFactory implements ElectronicMediaFactory{
    @Override
    public TV createTV() {
        return new LgTV();
    }

    @Override
    public Radio createRadio() {
        return new LgRadio();
    }

    @Override
    public DvdPlayer createDvdPlayer() {
        return new LgDvdPlayer();
    }
}
