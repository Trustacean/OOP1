/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circle;

/**
 *
 * @author LENOVO
 */

class Circle1Test {

    public static void main(String[] args) {
        Circle4 lingkaran1 = new Circle4(
                10, 160,
                120, "green");

        System.out.print("Area & Circumference Of Circle : ");
        lingkaran1.display();
        System.out.println(lingkaran1);
        lingkaran1.moveHorizontally(90);
        lingkaran1.moveVertically(55);
        System.out.println(lingkaran1);

    }
}

class Circle1 {
    private double radius;

    public Circle1() {

    }

    public void setRadius(double inputRadius) {
        radius = inputRadius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    public void display() {
        System.out.println(getArea());
    }
}
