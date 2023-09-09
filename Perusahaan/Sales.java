package Perusahaan;

public class Sales extends Pegawai {
    private int komisi;

    
    public void setKomisi(int komisi) {
        this.komisi = komisi;
    }

    public int getKomisi() {
        return komisi;
    }

    public int getGajiTotal() {
        return getWages()+komisi;
    }

    public String toString() {
            return super.toString() + "\n\nKomisi: " + komisi
            + "\nGaji : " + getWages() + "\n================================================"
            + "\nGaji Total: " + getGajiTotal();
    }
}
