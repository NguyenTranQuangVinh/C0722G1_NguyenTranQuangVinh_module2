package ss14_sort_algorithm.exercise.exercise2;

import java.util.Arrays;

public class InstallInsertionSortAlgorithm {
    public static void insertionSort(int[] array) {
        int key;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -540, 45, 678, -34928, 0, 23, 45};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
