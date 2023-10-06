package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(passed);
    }

}
