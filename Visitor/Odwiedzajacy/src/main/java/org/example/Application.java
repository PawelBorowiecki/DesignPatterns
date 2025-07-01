package org.example;

public class Application {
    public static void main(String[] args) {
        OperatingSystem ubuntu = new Linux("Ubuntu");
        OperatingSystem debian = new Linux("Debian");
        OperatingSystem windows11 = new Windows("11 Home");
        Visitor visitor = new InstallationVisitor();
        ubuntu.accept(visitor);
        debian.accept(visitor);
        windows11.accept(visitor);
    }
}