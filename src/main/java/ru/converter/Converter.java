package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(1000);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("1000 rubles are " + dollar + " dollar.");
    }

}
