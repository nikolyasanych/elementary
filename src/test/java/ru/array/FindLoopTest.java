package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int el = 10;
        int result = FindLoop.indexOf(arr, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas10Then1() {
        int[] arr = new int[] {1, 10, 3, 4, 5};
        int el = 10;
        int result = FindLoop.indexOf(arr, el);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

}