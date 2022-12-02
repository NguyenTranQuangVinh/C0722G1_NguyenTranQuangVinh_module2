package ss4_class_and_object.exercise.exercise1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (equation.getA() == 0) {
            System.out.println("Phương trình không phải là phương trình bậc hai. ");
        } else {
            double delta = equation.getDiscriminant();
            if (delta >= 0) {
                double root1 = equation.getRoot1();
                double root2 = equation.getRoot2();
                if (delta > 0) {
                    System.out.println("Phương trình có 2 nghiệm: " + root1 + "and" + root2);
                } else {
                    System.out.println("Phương trình chỉ có 1 nghiệm: " + root1);
                }

            } else {
                System.out.println("Phương trình không có nghiệm nguyên. ");
            }
        }
    }
}
