package ss7_abstract_class_and_interface.exercise.exercise1;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(5);
        shape[1]= new Rectangle(4,6);
        shape[2]= new Square(3);
        System.out.println(((Circle)shape[0]).getArea());
        ((Circle)shape[0]).resize();
        System.out.println(((Circle)shape[0]).getArea());
        System.out.println(((Rectangle)shape[1]).getArea());
        ((Rectangle)shape[1]).resize();
        System.out.println(((Rectangle)shape[1]).getArea());
        System.out.println(((Square)shape[2]).getAreaSquare());
        ((Square)shape[2]).resize();
        System.out.println(((Square)shape[2]).getAreaSquare());
    }
}
