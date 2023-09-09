package Inheritance.Cylinder.CylinderButNotInherit;

public class Cylinder {
    private double height;
    private Circle base;

    Cylinder() {
        this.base = new Circle();
        this.height = 10;
    }

    Cylinder(double height, Circle base) {
        this.height = height;
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public Circle getBase() {
        return base;
    }

    public double getBaseArea() {
        return base.getArea();
    }

    public double getArea() {
        return (base.getArea()*2)+(base.getCircumference()*height);
    }

    public double getVolume() {
        return (base.getArea()*height);
    }

    public String toString() {
        return base.toString() + String.format(", Height: %1$s", height);
    }
}
