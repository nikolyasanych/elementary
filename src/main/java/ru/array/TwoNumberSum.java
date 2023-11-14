package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i != j) {
            if (array[i] + array[j] > target) {
                j--;
            }
            if (array[i] + array[j] == target) {
                int[] result = {i, j};
                return result;
            }
            i++;
        }
        return new int[0];
    }
}
