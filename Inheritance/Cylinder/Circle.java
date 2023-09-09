package Inheritance.Cylinder;

public class Circle {
    private double radius;
    private String color;
    
    Circle (double r, String color) {
        this.radius = r;
        this.color = color;
    }

    Circle (double r) {
        this.radius = r;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return Math.PI * this.radius * 2;
    }

    public String toString() {
        return String.format("Radius: %1$s, Color: %2$s" , 
        this.radius, this.color);
    }
 }
