package ss7_abstract_class_and_interface.exercise.exercise2;

import ss7_abstract_class_and_interface.exercise.exercise1.Shape;

public class Test {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Circle(5);
        geometries[1]= new Rectangle(4,6);
        geometries[2]= new Square(3);
        System.out.println(geometries[0].getArea());
        ((Circle)geometries[0]).howToColor();
        System.out.println(geometries[1].getArea());
        ((Rectangle)geometries[1]).howToColor();
        System.out.println(geometries[2].getArea());
        ((Square)geometries[2]).howToColor();
    }

}
