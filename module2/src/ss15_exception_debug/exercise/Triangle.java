package ss15_exception_debug.exercise;

import java.util.Scanner;

public class Triangle {
    static double sideA;
    static double sideB;
    static double sideC;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập cạnh A: ");
                sideA = Double.parseDouble(scanner.nextLine());
                checkSide(sideA);
                break;
            } catch (IllegalArgumentException | IllegalTriangleException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("cạnh sai định dạng");
            }
        }
        while (true) {
            try {
                System.out.println("Nhập cạnh B: ");
                sideB = Double.parseDouble(scanner.nextLine());
                if (sideB < 0) {
                    throw new IllegalArgumentException("Chiều dài cạnh sai");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Cạnh sai định dạng");
            }
        }
        try {
            checkTriangle(sideC, sideB, sideA);
        } catch (IllegalArgumentException | IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkSide(double e) throws IllegalTriangleException {
        if (e < 0) {
            throw new IllegalTriangleException("Chiều dài cạnh sai");
        }
    }

    static void checkTriangle(double c, double b, double a) throws IllegalTriangleException {
        double sumAB = sideA + sideB;
        double sumAC = sideA + sideC;
        double sumBC = sideB + sideC;
        if (c > sumAB || b > sumAC || a > sumBC) {
            throw new IllegalTriangleException("Đây không phải 3 cạnh tam giác");
        } else {
            System.out.println("Đây là 3 cạnh tam giác");
        }
    }
}
