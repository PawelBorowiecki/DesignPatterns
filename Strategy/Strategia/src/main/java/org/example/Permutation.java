package org.example;

import java.math.BigInteger;

public class Permutation implements CombinatorialAnalysisStrategy{
    @Override
    public double count(int n, int k) {
        return Factorial.countFactorial(n);
    }
}
