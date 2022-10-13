package ss7_abstract_class_and_interface.exercise.exercise1;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(3);
        System.out.println(square.getAreaSquare());
        square.resize(10);
        System.out.println(square.getAreaSquare());
    }
}
