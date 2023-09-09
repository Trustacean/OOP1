package Perusahaan;

public class Manajer extends Pegawai {
    private int tunjangan;

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getGajiTotal() {
        return super.getWages()+this.tunjangan;
    }

    public String toString() {
        return super.toString() + "\n\nTunjangan: " + tunjangan
        + "\nGaji : " + getWages() + "\n================================================"
        + "\nGaji Total: " + getGajiTotal();
    }
}
