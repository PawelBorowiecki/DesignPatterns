package org.example;

public class InstallationVisitor implements Visitor{
    @Override
    public void visitLinux(Linux l) {
        System.out.println("Instalacja potrzebnych pakietow na Linux " + l.getDistribution() + " nastepuje poprzez komende sudo apt-get install nazwaPakietu.");
    }

    @Override
    public void visitWindows(Windows w) {
        System.out.println("Instalacja potrzebnych pakietow na Windows " + w.getDistribution() + " nastepuje poprzez komende start nazwaPakietu.exe");

    }
}
