package algorithm_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Nhập phần tử của mảng thứ: "+(i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
    }
}
