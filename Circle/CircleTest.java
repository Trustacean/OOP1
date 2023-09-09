package Circle;

class CircleTest {

    public static void main(String[] args) {
        Circle4 lingkaran1 = new Circle4(
                10, 160,
                120, "green");

        System.out.print("Area Of Circle : ");
        lingkaran1.display();
        System.out.println(lingkaran1);
        lingkaran1.moveHorizontally(90);
        lingkaran1.moveVertically(55);
        System.out.println(lingkaran1);

    }
}
