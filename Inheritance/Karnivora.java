package Inheritance;

public class Karnivora extends Hewan {
    public Karnivora(int k) {
        super(k);
//        kaki = k;
    }

    Karnivora(int k, String g) {
        super(k,g);
    }

    public String toString() {
        return super.toString();
    }
}
