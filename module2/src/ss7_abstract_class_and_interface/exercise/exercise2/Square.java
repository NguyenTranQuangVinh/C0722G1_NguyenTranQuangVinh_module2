package ss7_abstract_class_and_interface.exercise.exercise2;

public class Square extends Geometry implements Colorable{
    private double edge = 1.0;

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    double getArea() {

        return Math.pow(this.edge,2);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
