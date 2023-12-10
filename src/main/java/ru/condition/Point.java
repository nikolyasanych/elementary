package ru.condition;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow(another.x - x, 2) + Math.pow(another.y - y, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(15, 3);
        System.out.println(point2.distance(point1));
    }
}
