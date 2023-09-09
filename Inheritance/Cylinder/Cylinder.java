package Inheritance.Cylinder;

public class Cylinder extends Circle {
    private double height;

    Cylinder(double r) {
        super(r);
    }

    Cylinder(double r, String color) {
        super(r , color);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getBaseArea() {
        return super.getArea();
    }

    public double getArea() {
        return (super.getArea()*2)+(super.getCircumference()*this.height);
    }

    public double getVolume() {
        return (super.getArea()*this.height);
    }

    public String toString() {
        return super.toString() + String.format(", Height: %1$s",
         height);
    }
}
