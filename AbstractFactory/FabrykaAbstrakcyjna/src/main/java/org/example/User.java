package org.example;

public class User {
    private ElectronicMediaFactory factory;
    private TV tv;
    private Radio radio;
    private DvdPlayer dvdPlayer;

    public User(ElectronicMediaFactory factory) {
        this.factory = factory;
    }

    public void useDevices(){
        tv = factory.createTV();
        radio = factory.createRadio();
        dvdPlayer = factory.createDvdPlayer();
        tv.watch();
        radio.listen();
        dvdPlayer.play();
    }
}
