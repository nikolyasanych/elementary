package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;



class SortSelectedTest {

    @Test
    public void whenSort1() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {1, 4, 11, 4, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 4, 8, 11};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {21, 7, 77};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 21, 77};
        assertThat(result).containsExactly(expected);
    }

}