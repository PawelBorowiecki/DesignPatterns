package org.example;

public class SonyFactory implements ElectronicMediaFactory{
    @Override
    public TV createTV() {
        return new SonyTV();
    }

    @Override
    public Radio createRadio() {
        return new SonyRadio();
    }

    @Override
    public DvdPlayer createDvdPlayer() {
        return new SonyDvdPlayer();
    }
}
