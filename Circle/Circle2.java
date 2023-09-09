package Circle;

class Circle2 {
    final double DEFAULT_RADIUS = 8.8;
    final double DEFAULT_XPOS = 100;
    final double DEFAULT_YPOS = 100;
    final String DEFAULT_COLOR = "black";

    private double radius;
    private double xPos;
    private double yPos;
    private String color;

    public Circle2() {
        radius=DEFAULT_RADIUS;
        xPos=DEFAULT_XPOS;
        yPos=DEFAULT_YPOS;
        color=DEFAULT_COLOR;
    }

    public void setRadius(double inputRadius) {
        radius = inputRadius;
    }

    public double getRadius() {
        return radius;
    }
    public void setXPos(double inputXPos) {
        xPos = inputXPos;
    }
    public double getXPos() {
        return xPos;
    }
    public void setYPos(double inputYPos) {
        yPos = inputYPos;
    }
    public double getYPos() {
        return yPos;
    }
    public void setColor(String inputColor) {
        color = inputColor;
    }
    public String getColor() {
        return color;
    }

    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.pow(getRadius(), 2)  * Math.PI;
    }

    public String toString() {
        String result;
        result = "Radius: " + getRadius() + " X Pos: " 
        + getXPos() + " Y Pos: " + getYPos() + " Color: " 
        + getColor();
        return result;
    }

    public void display() {
        System.out.println(getArea());
        System.out.println(getCircumference());
    }
}
