package org.example;

public class Factorial {
    public static double countFactorial(int n){
        double result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
