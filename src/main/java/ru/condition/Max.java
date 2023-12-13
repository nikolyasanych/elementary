package ru.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int center) {
        return max(left, center) > right ? max(left, center) : right;
    }

    public static int max(int left, int right, int center, int middle) {
        return max(left, center) > max(right, middle) ? max(left, center) : max(right, middle);
    }

    public static void main(String[] args) {
        int maximum = Max.max(2, 10);
        System.out.println(maximum);
    }
}
