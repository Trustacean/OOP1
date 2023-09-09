package Abstract;

public class Sekretaris extends Pegawai {

    public double getGajiTotal() {
        return super.getGaji();
    }

    public String toString() {
        return super.toString()
        + "\nGaji : " + getGajiTotal() + "\n================================================"
        + "\nGaji Total: " + getGajiTotal();
}
}
