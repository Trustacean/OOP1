package Abstract;

public class Cabang {
    static final int MAX_PEGAWAI = 100;
    final String DEFAULT_KODE_CABANG = "B0001";
    final String DEFAULT_ALAMAT = "-";
    final String DEFAULT_KOTA = "Cities";

    private String kodeCabang;
    private String alamat;
    private String kota;
    private Pegawai pemimpin;
    private Pegawai [] pegawai;
    private int jumlahPegawai;

    public Cabang() {
        pegawai = new Pegawai[MAX_PEGAWAI];
        jumlahPegawai=0;
        kodeCabang=DEFAULT_KODE_CABANG;
        alamat=DEFAULT_ALAMAT;
        kota=DEFAULT_KOTA;
    }
    
    public Cabang(String kodeCabang, String alamat, String kota) {
        pegawai = new Pegawai[MAX_PEGAWAI];
        jumlahPegawai=0;
        setKodeCabang(kodeCabang);
        setAlamat(alamat);
        setKota(kota);
    }

    public void setKodeCabang(String kodeCabang) {
        this.kodeCabang = kodeCabang;

    }

    public String getKodeCabang() {
        return kodeCabang;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKota() {
        return kota;
    }

    public void setPemimpin(Pegawai pemimpin) {
        this.pemimpin = pemimpin;
    }

    public Pegawai getPemimpin() {
        return pemimpin;
    }

    public void setPegawai(Pegawai [] pegawai) {
        this.pegawai=pegawai;
    }

    public Pegawai[] getPegawai() {
        return pegawai;
    }

    public Pegawai getPegawai(int index) {
        return pegawai[index];
    }

    public void setGajiPegawai(int index, int jmlh) {
        this.pegawai[index].setGaji(jmlh);
    }

    public void setJumlahPegawai(int jumlahPegawai) {
        this.jumlahPegawai = jumlahPegawai;
    }
    
    public int getJumlahPegawai() {
        return jumlahPegawai;
    }

    public void printPegawai() {
        for (int i=0; i<this.jumlahPegawai; i++) {
            System.out.println(pegawai[i]+"\n");
        }
    }

    public boolean addPegawai(Pegawai pegawai) {
        if (this.jumlahPegawai==Cabang.MAX_PEGAWAI) {
            return false;
        } else {
            for (int i=0; i<this.pegawai.length ; i++) {
                if (this.pegawai[i]==null) {
                    this.pegawai[i]=pegawai;
                    this.jumlahPegawai++;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removePegawai(int index) {
        if (jumlahPegawai==0) {
            return false;
        } else {
            this.pegawai[index]=null;
            this.jumlahPegawai--;
            return true;
        }
    }

    public int findPegawai(String nama) {
        for (int j=0 ; j<jumlahPegawai ; j++) {
            if (nama.compareTo(pegawai[j].getNama())==0) {
                System.out.println("Pegawai ada di indeks ke - " + j);
                return j;
            }
        }
        System.out.println("Nama pegawai tidak ditemukan!");
        return -1;
    }

    public int findPegawai(int nip) {
        for (int j=0 ; j<jumlahPegawai ; j++) {
            if (nip==this.pegawai[j].getNip()) {
                System.out.println("Pegawai ada di indeks ke - " + j);
                return j;
            }
        }
        System.out.println("Nip pegawai tidak ditemukan!");
        return -1;
    }

    public Pegawai getPegawaiGajiTerbesar() {
        Pegawai gajiTerbesar = this.pegawai[0];
        for (int i=1 ; i<this.jumlahPegawai ; i++) {
            if (gajiTerbesar.getGaji()<this.pegawai[i].getGaji()) {
                gajiTerbesar = this.pegawai[i];
            }
        }
        return gajiTerbesar;
    }

    public Pegawai getPegawaiGajiTerkecil() {
        Pegawai gajiTerkecil = this.pegawai[0];
        for (int i=1 ; i>this.jumlahPegawai ; i++) {
            if (gajiTerkecil.getGaji()<this.pegawai[i].getGaji()) {
                gajiTerkecil = this.pegawai[i];
            }
        }
        return gajiTerkecil;
    }

    public void cetakGajiTotalSetiapPegawai() {
        System.out.println("Manajer : ");
        System.out.println();
        for (int i = 0; i < this.pegawai.length; i++) {
            if (pegawai[i] instanceof Manajer) {
                Manajer manj = (Manajer) pegawai[i];
                System.out.println(manj + "\n");
            }
        }
        System.out.println();
        System.out.println("Sekretaris : ");
        System.out.println();
        for (int i = 0; i < this.pegawai.length; i++) {
            if (pegawai[i] instanceof Sekretaris) {
                Sekretaris sekre = (Sekretaris)pegawai[i];
                System.out.println(sekre + "\n");
            }
        }
        System.out.println();
        System.out.println("Sales : ");
        System.out.println();
        for (int i = 0; i < this.pegawai.length; i++) {
            if (pegawai[i] instanceof Sales) {
                Sales sales = (Sales)pegawai[i];
                System.out.println(sales + "\n");
            }
        }
    }

    public String toString() {
        return "Pemimpin: " + pemimpin.getNama() + "\nKode Cabang: " +
         kodeCabang + "\nAlamat: " + alamat + "\nKota: " + kota;
    }
}
