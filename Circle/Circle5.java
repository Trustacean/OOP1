package Circle;


import java.awt.*; 

public class Circle5 {
    final double DEFAULT_RADIUS = 8.8;
    final double DEFAULT_XPOS = 100;
    final double DEFAULT_YPOS = 100;
    final String DEFAULT_COLOR = "black";

    private double radius;
    private double xPos;
    private double yPos;
    private String color;

    public Circle5() {
        this.radius = DEFAULT_RADIUS;
        this.xPos = DEFAULT_XPOS;
        this.yPos = DEFAULT_YPOS;
        this.color = DEFAULT_COLOR;
    }

    public Circle5(double inputRadius, double inputXPos,
            double inputYPos, String inputColor) {
        setRadius(inputRadius);
        setXPos(inputXPos);
        setYPos(inputYPos);
        setColor(inputColor);
    }

    public void setRadius(double inputRadius) {
        if (inputRadius < 0) {
            this.radius = 0;
            System.out.println("Radius must be greater than 0");
        } else {
        this.radius = inputRadius;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public void setXPos(double inputDistanceX) {
        this.xPos = inputDistanceX;
    }

    public double getXPos() {
        return this.xPos;
    }

    public void setYPos(double inputDistanceY) {
        this.yPos = inputDistanceY;
    }

    public double getYPos() {
        return this.yPos;
    }

    public double moveHorizontally(double inputXpos) {
        this.xPos += inputXpos;
        return this.xPos;
    }

    public double moveVertically(double inputYpos) {
        this.yPos += inputYpos;
        return this.yPos;
    }

    public void setColor(String inputColor) {
        this.color = inputColor;
    }

    public String getColor() {
        return this.color;
    }

    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    public String toString() {
        String result;
        result = "Radius: " + getRadius() + " X Pos: " +
                getXPos() + " Y Pos: " + getYPos() +
                "Color: " + getColor();
        return result;
    }

    public void display() {
        System.out.println(getArea());
        System.out.println(getCircumference());
    }

    public void draw(Graphics g) {
        switch (color) {
            case "white": 
                g.setColor(Color.WHITE);
                break;
            case "black": 
                g.setColor(Color.BLACK);
                break;
            case "red": 
                g.setColor(Color.RED);
                break;
            case "pink":
                g.setColor(Color.PINK);
                break;
            case "orange":
                g.setColor(Color.ORANGE);
                break;
            case "yellow":
                g.setColor(Color.YELLOW);
                break;
            case "green":
                g.setColor(Color.GREEN);
                break;
            case "blue":
                g.setColor(Color.BLUE);
                break;
            default:
                g.setColor(Color.BLACK);
                break;
        }

        g.fillArc((int)xPos,(int) yPos, 2 * (int) radius, 2* 
        (int)radius, (int) 0, (int) 360);
    }    
}
