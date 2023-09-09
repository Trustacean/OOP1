package Interface.Kantor;

public class Sales extends Pegawai {
    private int komisi;

    
    public void setKomisi(int komisi) {
        this.komisi = komisi;
    }

    public int getKomisi() {
        return komisi;
    }

    public double getGajiTotal() {
        return getGaji()+komisi;
    }

    public String toString() {
            return super.toString() + "\nKomisi: " + komisi
            + "\nGaji : " + getGaji() + "\n================================================"
            + "\nGaji Total: " + getGajiTotal();
    }
}
