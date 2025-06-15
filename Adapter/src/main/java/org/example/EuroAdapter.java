package org.example;

public class EuroAdapter implements MoneyConverter{
    private Euro euro;

    public EuroAdapter(Euro euro) {
        this.euro = euro;
    }

    @Override
    public double getConvertedQuantity(double conversionRate) {
        return euro.getQuantity() * conversionRate;
    }
}
