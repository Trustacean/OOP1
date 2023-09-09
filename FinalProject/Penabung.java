package FinalProject;

public class Penabung implements Berpendapatan {
    //  Constant and Attributes
    final double DEFAULT_TABUNGAN = 0;
    private String nama;
    private String alamat;
    private String nomorHP;
    private double tabungan;
    //  Constructors
    Penabung() {
        this.tabungan = DEFAULT_TABUNGAN;
    }

    Penabung(String nama) {
        this.tabungan = DEFAULT_TABUNGAN;
        this.nama = nama;
    }

    Penabung(String nama, String alamat) {
        this.tabungan = DEFAULT_TABUNGAN;
        this.nama = nama;
        this.alamat = alamat;
    }
    //  Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    //  Alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }
    //  Nomor HP
    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }
    
    public String getNomorHP() {
        return nomorHP;
    }
    //  Tabungan
    public double setor(Sampah sampah) {
        if (sampah instanceof Plastik) {
            Plastik temp =((Plastik) sampah);
            this.tabungan += temp.getHarga();
            return temp.getHarga();
        } else if (sampah instanceof Kertas) {
            Kertas temp =((Kertas) sampah);
            this.tabungan += temp.getHarga();
            return temp.getHarga();
        } else if (sampah instanceof Logam) {
            Logam temp =((Logam) sampah);
            this.tabungan += temp.getHarga();
            return temp.getHarga();
        }
        return -1;
    }
    //  Overloading setor
    public double setor(Kertas kertas){
        this.tabungan += kertas.getHarga();
        return kertas.getHarga();
    }

    public double setor(Plastik plastik){
        this.tabungan += plastik.getHarga();
        return plastik.getHarga();
    }

    public double setor(Logam logam){
        this.tabungan += logam.getHarga();
        return logam.getHarga();
    }

    public double tarik(double jumlah) {
        if (tabungan < 50000) {
            System.out.println("Minimal saldo tabungan adalah Rp 50.000,000");
            return -1;
        } else {
            tabungan -= jumlah;
            return jumlah;
        }
    }

    public double getTabungan() {
        return tabungan;
    }

    public double getPendapatan() {
        return getTabungan();
    }
    //  ToString
    public String toString() {
        return String.format("Nama : %1$s, Alamat : %2$s, Tabungan : Rp %3$s0", this.getNama(), this.getAlamat(), this.getTabungan());
    }

}
