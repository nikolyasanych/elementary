package ru.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent /=  100;
        double actual = amount;
        while (actual > 0) {
            actual = (actual + amount * percent) - salary;
            amount = actual;
            year++;
        }
        return year;
    }

}
