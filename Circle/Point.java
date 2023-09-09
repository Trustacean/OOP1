package Circle;

public class Point {
    final double DEFAULT_X=0;
    final double DEFAULT_Y=0;

    private double x;   
    private double y;

    public Point() {
        this.x=DEFAULT_X;
        this.y=DEFAULT_Y;
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "X = " + x + ", Y = " + y;
    }

    public double getDistance(double X, double Y) {
        double sigX=X-this.x;
        double sigY=Y-this.y;
        return Math.sqrt((sigX*sigX)+(sigY*sigY));
    }

    public double getDistance(Point object){
        return getDistance(object.getX(), object.getY());
    }

    public double getDistance() {
        return getDistance(0,0);
    }
}
