package ru.calculator;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(2, 3);
        Calculator.plus(100, 500);
    }
}
