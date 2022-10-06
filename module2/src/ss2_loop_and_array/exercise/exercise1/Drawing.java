package ss2_loop_and_array.exercise.exercise1;


import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        int height, weight, choosePicture;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào số hàng");
            height = scanner.nextInt();
            System.out.println("Nhập vào số cột");
            weight = scanner.nextInt();
            System.out.println("Hãy nhập hình cần hiển thị");
            System.out.println("1.hình chữ nhật \n" +
                    "2.hình tam giác vuông, có cạnh góc vuông ở botton-left \n" +
                    "3.hình tam giác vuông, có cạnh góc vuông ở top-left\n" +
                    "4.hình tam giác cân");
            System.out.println("5.Thoát chương trình");
            choosePicture = scanner.nextInt();

            switch (choosePicture) {
                case 1:
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= weight; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                    break;
                case 3:
                    for (int i = height; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                    break;
                case 4:
                    for (int i = 1; i <= height; i += 2) {
                        for (int j = 1; j <= weight - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập sai vui lòng nhập lại");
            }
        }
    }
}
