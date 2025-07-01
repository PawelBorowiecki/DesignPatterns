package org.example;

public class Windows implements OperatingSystem{
    private String distribution;

    public Windows(String distribution) {
        this.distribution = distribution;
    }

    @Override
    public void accept(Visitor v) {
        v.visitWindows(this);
    }

    @Override
    public void manageProcesses() {
        System.out.println("Zarzadzanie procesami na Windows" + distribution);
    }

    @Override
    public String getDistribution() {
        return distribution;
    }
}
