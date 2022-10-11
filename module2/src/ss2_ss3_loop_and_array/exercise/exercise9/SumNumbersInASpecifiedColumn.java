package ss2_loop_and_array.exercise.exercise9;

import java.util.Scanner;

public class SumNumbersInASpecifiedColumn {
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
        System.out.println("Ma trận vừa nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }
        int column;
        do {
            System.out.println("Nhập vị trí cột bạn muốn tính tổng");
            column = Integer.parseInt(scanner.nextLine());
            if (column > n || column < 0) {
                System.out.println("vị trí cột không hợp lệ. Vui lòng nhập lại ");
            }
        } while (column > n || column < 0);
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i][column];
        }
        System.out.println(" tổng cần tìm là: " + sum);
    }
}
