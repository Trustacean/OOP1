package Interface.Kampus;
import Interface.Kantor.Pegawai;
import Interface.Kantor.Manajer;

public class Test {
    public static void main(String[] args) {
        Pegawai karyawan = new Manajer();
        karyawan.setEmail("Manajer@gmail.com");
        Mahasiswa mahasiswa1 = new  Mahasiswa("005314200", "Ria");
        mahasiswa1.setEmail("Mhs@gmail.com");
        
        System.out.println(karyawan.getEmail());
        System.out.println(mahasiswa1.getEmail());

    }
}
