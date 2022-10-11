package ss5_access_modifier_static_method_static_property.exercise.exercise2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        student.setName(name);
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập trường của bạn: ");
        String school = input.nextLine();
        student.setClasses(school);
        System.out.println("name: "+student.getName());
        System.out.println("classes: "+student.getClasses());
    }
}
