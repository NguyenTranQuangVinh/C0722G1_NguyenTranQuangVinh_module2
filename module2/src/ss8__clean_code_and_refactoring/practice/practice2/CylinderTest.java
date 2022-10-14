package ss8__clean_code_and_refactoring.practice.practice2;

public class CylinderTest {
    public static void main(String[] args) {
        double radius = Math.random() * 100;
        double height = Math.random() * 100;
        System.out.println(radius + " , "+height);
        System.out.println(Cylinder.getArea(radius));
        System.out.println(Cylinder.getPerimeter(radius));
        System.out.println(Cylinder.getVolume(radius,height));
    }
}
