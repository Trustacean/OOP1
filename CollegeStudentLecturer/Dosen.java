package CollegeStudentLecturer;

public class Dosen {
    private String nip;
    private String name;
    private String email;

    public Dosen () {

    }

    public Dosen (String nip, String name) {
        setNip(nip);
        setName(name);
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Nama : " + this.name + "\nNIP : " + this.nip;
    }
}
