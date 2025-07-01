package org.example;

public class Linux implements OperatingSystem{
    private String distribution;

    public Linux(String distribution) {
        this.distribution = distribution;
    }

    @Override
    public void accept(Visitor v) {
        v.visitLinux(this);
    }

    @Override
    public void manageProcesses() {
        System.out.println("Zarzadzanie procesami na Linux " + distribution);
    }

    @Override
    public String getDistribution() {
        return distribution;
    }
}
