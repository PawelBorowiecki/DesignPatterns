package org.example;

public class Mathematician {
    private CombinatorialAnalysisStrategy combinatorialStrategy;

    public Mathematician(CombinatorialAnalysisStrategy combinatorialStrategy) {
        this.combinatorialStrategy = combinatorialStrategy;
    }

    public void setCombinatorialStrategy(CombinatorialAnalysisStrategy combinatorialStrategy) {
        this.combinatorialStrategy = combinatorialStrategy;
    }

    public double countOperation(int n, int k){
        return combinatorialStrategy.count(n, k);
    }
}
