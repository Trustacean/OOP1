package Circle;

class CircleMain {

    public static void main(String[] args) {
        Circle6 lingkaran1 = new Circle6(
                10, 160,
                120, "green");
        Point center2 = new Point(12 , 55);

        Point center = new Point(2 , 6);
        lingkaran1.setCenter(center);

        System.out.println(center.getDistance(center2));
        System.out.println(center.getDistance());
        System.out.print("Area Of Circle : ");
        lingkaran1.display();
        System.out.println(lingkaran1);

    }
}
