package org.example;

import java.util.Map;

public class Context {
    private Map<Character, Integer> symbols;

    public Context() {
        symbols = Map.of(
           '0', 0,
           '1', 1,
           '2', 2,
           '3', 3,
           '4', 4,
           '5', 5,
           '6', 6,
           '7', 7,
           '8', 8,
           '9', 9
        );
    }

    public Map<Character, Integer> getSymbols() {
        return symbols;
    }
}
