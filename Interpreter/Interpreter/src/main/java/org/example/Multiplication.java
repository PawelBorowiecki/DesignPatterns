package org.example;

public class Multiplication implements Expression{
    private Expression expression1;
    private Expression expression2;
    private Number n1;
    private Number n2;

    public Multiplication(Number n1, Number n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Multiplication(Expression expression1, Expression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int evaluate(Context context) {
        int result = 1;
        if(expression1 != null) {
            result = expression1.evaluate(context);
            result *= expression2.evaluate(context);
        }else{
            result = n1.evaluate(context) * n2.evaluate(context);
        }
        return result;
    }
}
