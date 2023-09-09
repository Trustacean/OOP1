package Perusahaan;

public class Sekretaris extends Pegawai {

    public String toString() {
        return super.toString()
        + "\n\nGaji : " + getWages() + "\n================================================"
        + "\nGaji Total: " + getWages();
}
}
