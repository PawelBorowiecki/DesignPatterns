package org.example;

public interface OperatingSystem {
    void accept(Visitor v);
    void manageProcesses();
    String getDistribution();
}
