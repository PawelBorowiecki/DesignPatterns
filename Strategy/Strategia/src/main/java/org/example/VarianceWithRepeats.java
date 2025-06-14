package org.example;

public class VarianceWithRepeats implements CombinatorialAnalysisStrategy{
    @Override
    public double count(int n, int k) {
        return Math.pow(n, k);
    }
}
