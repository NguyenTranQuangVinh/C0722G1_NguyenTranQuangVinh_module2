package ss2_loop_and_array.exercise.exercise10;

import java.util.Scanner;

public class TwoDimensionalArraySumTheNumbersAtTheMainDiagonalOfASquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        do {
            System.out.println("Nhập vào hàng: ");
            m = Integer.parseInt(scanner.nextLine());
            if (m <= 0) {
                System.out.println("Số lượng hàng > 0, xin nhập lại!!!");
            }
        } while (m <= 0);
        do {
            System.out.println("Nhập vào cột: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("Số lượng cột > 0, xin nhập lại!!!");
            }
        } while (n <= 0);
        int[][] arr = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.println("Nhập vào phần tử giá trị thứ ["+i+"]["+j+"]: ");
                arr[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
    }
}
