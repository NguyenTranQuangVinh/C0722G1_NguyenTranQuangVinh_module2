package ss15_exception_debug.exercise;

import java.util.Scanner;

public class Triangle {
    static double sideA;
    static double sideB;
    static double sideC;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        while (true) {
            try {
                System.out.println("Nhập cạnh A: ");
                sideA = Double.parseDouble(scanner.nextLine());
                triangle.checkSide(sideA);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Nhập cạnh b: ");
                sideB = Double.parseDouble(scanner.nextLine());
                triangle.checkSide(sideB);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true){
            try{
                System.out.print("Nhap cạnh C: ");
                sideC = Double.parseDouble(scanner.nextLine());
                triangle.checkSide(sideC);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            triangle.checkTriangle(sideC, sideB, sideA);
        } catch (IllegalArgumentException | IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkSide(double e) throws IllegalTriangleException {
        if (e <= 0) {
            throw new IllegalTriangleException("Chiều dài cạnh sai");
        }
    }

    static void checkTriangle(double c, double b, double a) throws IllegalTriangleException {
        double sumAB = sideA + sideB;
        double sumAC = sideA + sideC;
        double sumBC = sideB + sideC;
        if (c >= sumAB || b >= sumAC || a >= sumBC) {
            throw new IllegalTriangleException("Đây không phải 3 cạnh tam giác");
        } else {
            System.out.println("Đây là 3 cạnh tam giác");
        }
    }
}
