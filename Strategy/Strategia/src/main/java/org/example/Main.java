package org.example;

public class Main {
    public static void main(String[] args) {
        CombinatorialAnalysisStrategy strategy1 = new Permutation();
        CombinatorialAnalysisStrategy strategy2 = new VarianceWithRepeats();
        CombinatorialAnalysisStrategy strategy3 = new VarianceWithoutRepeats();
        CombinatorialAnalysisStrategy strategy4 = new Combination();
        Mathematician mathematician = new Mathematician(strategy1);
        System.out.println("Permutacja: " + mathematician.countOperation(5, 2));
        mathematician.setCombinatorialStrategy(strategy2);
        System.out.println("Wariancja z powtorzeniami: " + mathematician.countOperation(5, 2));
        mathematician.setCombinatorialStrategy(strategy3);
        System.out.println("Wariancja bez powtorzen: " + mathematician.countOperation(5, 2));
        mathematician.setCombinatorialStrategy(strategy4);
        System.out.println("Kombinacja: " + mathematician.countOperation(5, 2));
    }
}