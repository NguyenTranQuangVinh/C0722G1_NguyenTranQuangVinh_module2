package ss5_access_modifier_static_method_static_property.exercise.exercise1;

import java.util.Scanner;

public class TestAccessModifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        double number = input.nextInt();
        Circle circle = new Circle(number);
        System.out.println("circle radius: " + circle.getRadius());
        System.out.println("circle area: " + circle.getArea());
    }
}
