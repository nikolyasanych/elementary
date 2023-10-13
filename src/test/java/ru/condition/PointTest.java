package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00And20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double actual = Point.distance(x1, y1, x2, y2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when10And20Then1() {
        double expected = 1;
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double actual = Point.distance(x1, y1, x2, y2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void when01And23Then2Dot82() {
        double expected = 2.82;
        double eps = 0.01;
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        double actual = Point.distance(x1, y1, x2, y2);
        assertThat(actual).isEqualTo(expected, withPrecision(eps));
    }
}