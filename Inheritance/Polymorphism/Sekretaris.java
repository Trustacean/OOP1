package Inheritance.Polymorphism;

public class Sekretaris extends Pegawai {

    public double getGajiTotal() {
        return super.getGaji();
    }

    public String toString() {
        return super.toString()
        + "\nGaji : " + getGaji() + "\n================================================"
        + "\nGaji Total: " + getGaji();
}
}
