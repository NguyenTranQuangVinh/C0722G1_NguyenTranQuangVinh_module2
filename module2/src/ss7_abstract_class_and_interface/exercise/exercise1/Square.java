package ss7_abstract_class_and_interface.exercise.exercise1;

public class Square extends Shape implements Resizeable {
    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getAreaSquare() {
        return this.edge * this.edge;
    }

    @Override
    public void resize(double percent) {
        this.edge += this.edge * percent / 100;

    }

    @Override
    public void resize() {
        this.edge += this.edge * Math.random();
    }
}
