package ru.condition;

public class SqArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        return i * h;
    }

    public static void main(String[] args) {
        System.out.println(SqArea.square(6, 2));
    }
}
