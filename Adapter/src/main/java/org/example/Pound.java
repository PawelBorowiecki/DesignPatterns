package org.example;

public class Pound {
    private double quantity;

    public Pound(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isSameQuantityInEuro(MoneyConverter euroConverter, double conversionRate){
        return quantity == euroConverter.getConvertedQuantity(conversionRate);
    }
}
