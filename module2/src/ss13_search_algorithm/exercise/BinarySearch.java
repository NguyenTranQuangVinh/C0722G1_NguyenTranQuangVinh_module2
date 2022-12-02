package ss13_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử của mảng thứ: " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, 5, 0, arr.length - 1));
    }

    public static int binarySearch(int[] array, int value, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (value > array[mid]) {
                return binarySearch(array, value, mid + 1, right);
            }
            return binarySearch(array, value, left, mid - 1);
        }
        return -1;
    }

}
