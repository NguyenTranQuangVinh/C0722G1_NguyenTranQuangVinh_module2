package ss7_abstract_class_and_interface.exercise.exercise1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle.getArea());
        rectangle.resize(5);
        System.out.println(rectangle.getArea());

    }
}
