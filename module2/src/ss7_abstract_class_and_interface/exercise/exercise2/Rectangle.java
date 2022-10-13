package ss7_abstract_class_and_interface.exercise.exercise2;

public class Rectangle extends Geometry implements Colorable{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    double getArea() {
        return this.width*this.length;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
