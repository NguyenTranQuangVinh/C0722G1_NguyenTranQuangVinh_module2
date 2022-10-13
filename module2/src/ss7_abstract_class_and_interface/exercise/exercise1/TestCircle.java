package ss7_abstract_class_and_interface.exercise.exercise1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle.getArea());
        circle.resize(10);
        System.out.println(circle.getArea());

    }
}
