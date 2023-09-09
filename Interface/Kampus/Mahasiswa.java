package Interface.Kampus;
import Interface.Beremail;

public class Mahasiswa implements Beremail{
    private String nim;
    private String nama;
    private String email;

    public  Mahasiswa() {

    }
    public  Mahasiswa(String no, String name) {
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
    

    public String toString() {
        
        return "Nama : " + this.nama + "\nNim : " + this.nim;
    }
}
