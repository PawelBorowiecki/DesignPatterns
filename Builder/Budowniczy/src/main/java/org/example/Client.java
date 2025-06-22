package org.example;

public class Client {
    public static void main(String[] args) {
        AirplaneBuilder airplaneBuilder = new AirplaneBuilder();
        JetBuilder jetBuilder = new JetBuilder();
        Director director = new Director(airplaneBuilder);
        director.makeAirplane();
        Airplane airplane = airplaneBuilder.getAirplane();
        airplaneBuilder.reset();
        System.out.println("Created airplane: " + airplane.toString());
        director.changeBuilder(jetBuilder);
        director.makeJet();
        Jet jet = jetBuilder.getJet();
        jetBuilder.reset();
        System.out.println("Created jet: " + jet.toString());
    }
}