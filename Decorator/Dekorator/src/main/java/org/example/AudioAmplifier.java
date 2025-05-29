package org.example;

public class AudioAmplifier extends CarAccessoryDecorator{
    public AudioAmplifier(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        String result = super.getDescription();
        result += " ze wzmacniaczem akustycznym.";
        return result;
    }
}
