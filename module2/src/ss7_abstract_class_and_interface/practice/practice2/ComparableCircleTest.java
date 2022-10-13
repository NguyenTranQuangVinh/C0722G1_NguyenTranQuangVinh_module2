package ss7_abstract_class_and_interface.practice.practice2;
import java.util.Arrays;
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6,"blue");
        circles[1] = new ComparableCircle(2,"black");
        circles[2] = new ComparableCircle(3.5, "indigo");

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle.toString());
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle.toString());
        }
    }
}
