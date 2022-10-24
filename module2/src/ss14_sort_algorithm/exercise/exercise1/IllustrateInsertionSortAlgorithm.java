package ss14_sort_algorithm.exercise.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class IllustrateInsertionSortAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng ban đầu là:\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
            System.out.println("Mảng sau khi sắp xếp lần " + (i + 1) + ":\n" + Arrays.toString(arr));
        }
        System.out.println("Mảng sau khi sắp xếp là: \n" + Arrays.toString(arr));
    }
}
