package text_all;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        int width = scanner.nextInt();
        for (int i = 2; i <= width; i++) {
            for (int j = -5; j < 2 * width; j++) {
                if (Math.abs(width - j) == (i - 1)) {
                    System.out.print(i - 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = width + 1; i > 1; i--) {
            for (int j = -5; j <= 2 * width; j++) {
                if (Math.abs(width - j) == (i - 1)) {
                    System.out.print(i - 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
