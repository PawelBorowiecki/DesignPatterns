package org.example;

public class Combination implements CombinatorialAnalysisStrategy{
    @Override
    public double count(int n, int k) {
        return Factorial.countFactorial(n) / (Factorial.countFactorial(n-k) * Factorial.countFactorial(k));
    }
}
