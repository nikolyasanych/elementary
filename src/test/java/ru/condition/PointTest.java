package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00And20Then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double actual = point1.distance(point2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when10And20Then1() {
        double expected = 1;
        Point point1 = new Point(1, 0);
        Point point2 = new Point(2, 0);
        double actual = point1.distance(point2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when01And23Then2Dot82() {
        double expected = 2.82;
        double eps = 0.01;
        Point point1 = new Point(0, 1);
        Point point2 = new Point(2, 3);
        double actual = point1.distance(point2);
        assertThat(actual).isEqualTo(expected, withPrecision(eps));
    }
}