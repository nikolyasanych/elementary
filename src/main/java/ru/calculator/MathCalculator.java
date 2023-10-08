package ru.calculator;
import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return diff(first, second)
                + div(first, second);
    }

    public static double sumOfAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + diff(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и деления: " + diffAndDiv(20, 10));
        System.out.println("Сумма всего: " + sumOfAll(20, 10));
    }

}
