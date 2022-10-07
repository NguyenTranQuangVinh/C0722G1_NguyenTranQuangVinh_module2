package ss2_loop_and_array.exercise.exercise10;

import java.util.Scanner;

public class TwoDimensionalArraySumTheNumbersAtTheMainDiagonalOfASquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m;
        do {
            System.out.println("Nhập vào hàng: ");
            m = Integer.parseInt(scanner.nextLine());
            if (m <= 0) {
                System.out.println("Số lượng hàng > 0, xin nhập lại!!!");
            }
        } while (m <= 0);

        int[][] arr = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập vào phần tử giá trị thứ [" + i + "][" + j + "]: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Ma trận vừa nhập là: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
