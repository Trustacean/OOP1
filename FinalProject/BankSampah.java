package FinalProject;

public class BankSampah {
    // Constants and Attributes
    static final int MAX_PENGEPUL = 5;
    static final int MAX_PENABUNG = 100;
    private String alamat;
    private Pengepul[] pengepul;
    private Penabung[] penabung;

    // Constructors
    BankSampah() {
        penabung = new Penabung[MAX_PENABUNG];
        pengepul = new Pengepul[MAX_PENGEPUL];
    }

    BankSampah(String alamat) {
        penabung = new Penabung[MAX_PENABUNG];
        pengepul = new Pengepul[MAX_PENGEPUL];
        this.alamat = alamat;
    }

    // Alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    // Pengepul
    public void setPengepul(Pengepul[] pengepul) {
        this.pengepul = pengepul;
    }

    public boolean addPengepul(Pengepul pengepul) {
        if (getJumlahPengepul() == MAX_PENGEPUL) {
            return false;
        } else {
            for (int i = 0; i < MAX_PENGEPUL; i++) {
                if (this.pengepul[i] == null) {
                    this.pengepul[i] = pengepul;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removePengepul(int index) {
        if (getJumlahPengepul() == 0 || index > MAX_PENGEPUL - 1) {
            return false;
        } else {
            this.pengepul[index] = null;
            return true;
        }
    }

    public Pengepul[] getPengepul() {
        return this.pengepul;
    }

    public int getJumlahPengepul() {
        int temp = 0;
        for (int i = 0; i < MAX_PENGEPUL; i++) {
            if (this.pengepul[i] != null) {
                temp++;
            }
        }
        return temp;
    }

    public void printPengepul() {
        for (int i = 0; i < MAX_PENGEPUL; i++) {
            if (pengepul[i] != null) {
                System.out.println(pengepul[i]);
            }
        }
    }

    // Penabung
    public void setPenabung(Penabung[] penabung) {
        this.penabung = penabung;
    }

    public boolean addPenabung(Penabung penabung) {
        if (getJumlahPengepul() == MAX_PENABUNG) {
            return false;
        } else {
            for (int i = 0; i < MAX_PENABUNG; i++) {
                if (this.penabung[i] == null) {
                    this.penabung[i] = penabung;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removePenabung(int index) {
        if (getJumlahPenabung() == 0 || index > MAX_PENABUNG - 1) {
            return false;
        } else {
            this.penabung[index] = null;
            return true;
        }
    }

    public Penabung[] getPenabung() {
        return penabung;
    }

    public int getJumlahPenabung() {
        int temp = 0;
        for (int i = 0; i < MAX_PENABUNG; i++) {
            if (this.penabung[i] != null) {
                temp++;
            }
        }
        return temp;
    }

    public void printPenabung() {
        for (int i = 0; i < MAX_PENABUNG; i++) {
            if (penabung[i] != null) {
                System.out.println(penabung[i]);
            }
        }
    }

    public String toString() {
        return String.format("Bank Sampah\nAlamat : %1$s\nJumlah Pengepul : %2$s\nJumlah Penabung : %3$s", this.alamat,
                getJumlahPengepul(), getJumlahPenabung());
    }
}
