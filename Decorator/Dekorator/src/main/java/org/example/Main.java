package org.example;

public class Main {
    public static void main(String[] args) {
        Car volvo = new Volvo();
        System.out.println(volvo.getDescription());

        Car volvoWithDigitalDashboard = new DigitalDashboard(volvo);
        System.out.println(volvoWithDigitalDashboard.getDescription());

        Car volvoWithLaneAssist = new LaneAssist(volvo);
        System.out.println(volvoWithLaneAssist.getDescription());

        Car volvoWithAudioAmplifier = new AudioAmplifier(volvo);
        System.out.println(volvoWithAudioAmplifier.getDescription());
    }
}