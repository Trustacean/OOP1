package CollegeStudentLecturer;

public class Mahasiswa{
    static final int MAX_POIN = 5;
    private String nim;
    private String nama;
    private String email;
    private Dosen pembimbing;
    private Aktivitas [] aktivitas;

    public  Mahasiswa() {

    }
    public  Mahasiswa(String no, String name) {
        aktivitas = new Aktivitas [MAX_POIN];
        setNim(no);
        setNama(name);
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPembimbing(Dosen pembimbing) {
        this.pembimbing = pembimbing;
    }

    public Dosen getPembimbing() {
        return pembimbing;
    }

    public void setAktivitas(Aktivitas[] aktivitas) {
        this.aktivitas = aktivitas;
    }

    public Aktivitas[] getAktivitas() {
        return aktivitas;
    }
    
    public void printAktivitas() {
        int totalPoin=0;
        for (int i = 0; i < aktivitas.length; i++) {
            if (aktivitas[i] != null) {
                System.out.println(aktivitas[i]);
                totalPoin++;
            }
        }
        System.out.println("Total Poin : "+totalPoin);
    }

    public String toString() {
        
        return "Nama : " + this.nama + "\nNim : " + this.nim + 
        "\nDosen Pembimbing : " + this.pembimbing.getName();
    }
}
