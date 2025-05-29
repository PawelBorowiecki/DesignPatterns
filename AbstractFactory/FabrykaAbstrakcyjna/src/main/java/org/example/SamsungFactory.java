package org.example;

public class SamsungFactory implements ElectronicMediaFactory{
    @Override
    public TV createTV() {
        return new SamsungTV();
    }

    @Override
    public Radio createRadio() {
        return new SamsungRadio();
    }

    @Override
    public DvdPlayer createDvdPlayer() {
        return new SamsungDvdPlayer();
    }
}
