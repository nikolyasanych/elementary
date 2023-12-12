package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To4Then4() {
        int left = 1;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To3To4Then4() {
        int left = 2;
        int right = 3;
        int center = 4;
        int result = Max.max(left, right, center);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To3To5To10Then10() {
        int left = 2;
        int right = 3;
        int center = 5;
        int middle = 10;
        int result = Max.max(left, right, center, middle);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

}