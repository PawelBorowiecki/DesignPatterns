package org.example;

public class Main {
    public static void main(String[] args) {
        ElectronicMediaFactory sonyFactory = new SonyFactory();
        ElectronicMediaFactory samsungFactory = new SamsungFactory();
        ElectronicMediaFactory lgFactory = new LgFactory();
        User user = new User(sonyFactory);
        user.useDevices();
        user = new User(samsungFactory);
        user.useDevices();
        user = new User(lgFactory);
        user.useDevices();
    }
}