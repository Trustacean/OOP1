package Circle;

// import java.awt.*; 

public class Circle6 {
    final double DEFAULT_RADIUS = 8.8;
    final String DEFAULT_COLOR = "black";

    private double radius;
    private String color;
    private Point center;

    public Circle6() {
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }

    public Circle6(double inputRadius, double inputXPos,
            double inputYPos, String inputColor) {
        setRadius(inputRadius);
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

/*     public double moveHorizontally(double inputXpos) {
        this.xPos += inputXpos;
        return this.xPos;
    }

    public double moveVertically(double inputYpos) {
        this.yPos += inputYpos;
        return this.yPos;
    }
*/
    public void setColor(String inputColor) {
        this.color = inputColor;
    }

    public String getColor() {
        return this.color;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    public String toString() {
        return "Radius: " + getRadius() + 
        " Color: " + getColor() + " Center: " + center;
    }

    public void display() {
        System.out.println(getArea());
        System.out.println(getCircumference());
    }

/*    public void draw(Graphics g) {
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
    }     */
}

