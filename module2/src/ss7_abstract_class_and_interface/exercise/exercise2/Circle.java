package ss7_abstract_class_and_interface.exercise.exercise2;

public class Circle extends Geometry implements Colorable{
    private double radius = 1.0;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {

        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public void howToColor() {
        System.out.println("Color the whole circle");
    }
}
