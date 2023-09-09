package Interface.Kantor;
import Interface.Beremail;

public abstract class Pegawai implements Bergaji,Beremail{
    final String DEFAULT_EMAIL = "email@yahoo.com";
    final String DEFAULT_NAMA = "Pegawai";
    final int DEFAULT_NIP = 001;
    final int DEFAULT_GAJI = 0;
    private String email;
    private String nama;
    private int nip;
    private int gaji;

    Pegawai() {
        this.email = DEFAULT_EMAIL;
        this.nama = DEFAULT_NAMA;
        this.nip = DEFAULT_NIP;
        this.gaji = DEFAULT_GAJI;
    }

    Pegawai(int nip) {
        this.email = DEFAULT_EMAIL;
        this.nama = DEFAULT_NAMA;
        this.nip = nip;
        this.gaji = DEFAULT_GAJI;
    }

    Pegawai(String nama, int nip, int gaji) {
        this.email = DEFAULT_EMAIL;
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
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

    public abstract double getGajiTotal();

    public void cetakGajiTunjangan() {
        if (this instanceof Manajer) {
            Manajer manajer = (Manajer) this;
            System.out.println(manajer.getTunjangan());
        }
    }

    public String toString() {
        return String.format("Nama : %1$s, Nip : %2$s, Gaji : %3$s",
         this.nama, this.nip, this.gaji);
    }
}
