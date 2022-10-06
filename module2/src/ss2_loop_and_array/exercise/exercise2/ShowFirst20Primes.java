package ss2_loop_and_array.exercise.exercise2;

import java.util.Scanner;

public class ShowFirst20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử là số nguyên tố cẩn hiện thị: ");
        int number = Integer.parseInt(scanner.nextLine());
        int browser = 0;
        int n = 2;
        while (browser < number) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(n + ", ");
                browser++;
            }
            n++;
        }
    }
}
