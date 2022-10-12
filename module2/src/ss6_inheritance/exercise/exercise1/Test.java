package ss6_inheritance.exercise.exercise1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue");
        Cylinder cylinder = new Cylinder(5,"red",6);
        System.out.println("diện tích hình tròn: " + circle.getArea());
        System.out.println("thể tích hình trụ: " + cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}
