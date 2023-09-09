package Abstract;

public class Manajer extends Pegawai {
    private int tunjangan;

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public double getGajiTotal() {
        return super.getGaji()+this.tunjangan;
    }

    public String toString() {
        return super.toString() + "\nTunjangan: " + tunjangan
        + "\nGaji : " + getGaji() + "\n================================================"
        + "\nGaji Total: " + getGajiTotal();
    }
}
