package Inheritance;

public class Hewan {
    protected int kaki, umur;
    protected String gigi;
    Hewan (int k) {
        this.kaki = k;
    }

    Hewan (int k, String g) {
        this.kaki = k;
        this.gigi = g;
    }

    public String toString() {
        return ""+this.kaki;
    }
}
