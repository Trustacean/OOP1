package Inheritance.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder link = new Cylinder(10, "Green");
        link.setHeight(10);
        
        System.out.println(link.getBaseArea());
        System.out.println(link.getCircumference());
        System.out.println(link.getVolume());
        System.out.println(link.getArea());
        System.out.println(link);
    }
}
