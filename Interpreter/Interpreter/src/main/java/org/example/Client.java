package org.example;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Expression exp1 = new Multiplication(new Number('2'), new Number('8'));
        Expression exp2 = new Multiplication(new Number('1'), new Number('4'));
        Expression exp3 = new Division(exp1, exp2);
        int result = exp3.evaluate(context);
        System.out.println(result);
        Expression exp4 = new Division(new Number('9'), new Number('3'));
        Expression exp5 = new Division(new Number('8'), new Number('4'));
        Expression exp6 = new Multiplication(exp4, exp5);
        result = exp6.evaluate(context);
        System.out.println(result);
    }
}