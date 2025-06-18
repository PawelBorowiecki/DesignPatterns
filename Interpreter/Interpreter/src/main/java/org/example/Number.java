package org.example;

public class Number implements Expression{
    char symbol;
    int value;

    public Number(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public int evaluate(Context context) {
        value = context.getSymbols().get(symbol);
        return value;
    }
}
