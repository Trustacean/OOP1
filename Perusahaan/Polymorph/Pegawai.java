package Perusahaan.Polymorph;

public class Pegawai {
    final String DEFAULT_NAMA = "Pegawai";
    final int DEFAULT_NIP = 001;
    final int DEFAULT_GAJI = 0;
    private String nama;
    private int nip;
    private int gaji;

    Pegawai() {

    }

    Pegawai(String nama, int nip, int gaji) {

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getNip() {
        return nip;
    }

    public void setGaji(int gaji) {
        if (gaji < 0) {
            this.gaji = 0;
        } else {
            this.gaji = gaji;
        }
    }

    public int getGaji() {
        return gaji;
    }

    public String toString() {
        return String.format("Nama : %1$s, Nip : %2$s, Gaji : %3$s", this.nama, this.nip, this.gaji);
    }
}
