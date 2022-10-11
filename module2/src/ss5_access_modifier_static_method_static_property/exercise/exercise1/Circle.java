package ss5_access_modifier_static_method_static_property.exercise.exercise1;

public class Circle {
    double radius = 1.0;
    String color = "Red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
