package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class SqAreaTest {

    @Test
    void whenP6AndK2Then2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double actual = SqArea.square(p, k);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenP10AndK2Then5Dot56() {
        double expected = 5.56;
        double p = 10;
        double k = 2;
        double actual = SqArea.square(p, k);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP15AndK3Then10Dot55() {
        double expected = 10.55;
        double p = 15;
        double k = 3;
        double actual = SqArea.square(p, k);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }
}