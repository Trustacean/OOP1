package FinalProject;

public class Pengepul implements Berpendapatan{
    //  Constatnt and Attributes
    final double DEFAULT_GAJI_POKOK = 1000;
    final double DEFAULT_KOMISI = 500;
    private String nama;
    private double gajiPokok;
    private double komisi;
    private double goal;
    //  Constructors
    Pengepul() {
        this.gajiPokok = DEFAULT_GAJI_POKOK;
        this.komisi = DEFAULT_KOMISI;
    }

    Pengepul(String nama, double goal) {
        this.gajiPokok = DEFAULT_GAJI_POKOK;
        this.komisi = DEFAULT_KOMISI;
        this.nama = nama;
        this.goal = goal;
    }
    //  Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    //  Gaji
    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok<0) {
            this.gajiPokok = 0;
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    public double getGajiPokok() {
        return gajiPokok;
    }
    //  Komisi
    public void setKomisi(double komisi) {
        if (komisi<0) {
            this.komisi = 0;
        } else {
            this.komisi = komisi;
        }
    }

    public double getKomisi() {
        return komisi;
    }
    //  Goal
    public void setGoal(double goal) {
        this.goal = goal;
    }

    public double getGoal() {
        return goal;
    }
    //  Pendapatan
    public double getPendapatan() {
        return this.gajiPokok+(this.komisi*goal);
    }

    //  ToString
    public String toString() {
        return String.format("Nama : %1$s Pendapatan : %2$s :",this.nama,getPendapatan() );
    }
}
