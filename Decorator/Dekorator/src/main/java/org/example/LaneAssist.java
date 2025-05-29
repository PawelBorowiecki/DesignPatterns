package org.example;

public class LaneAssist extends CarAccessoryDecorator{
    public LaneAssist(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        String result = super.getDescription();
        result += " z asystentem pasa ruchu.";
        return result;
    }
}
