package Interface.Kantor;

public class Test2 {
    public static void main(String[] args) {
        Pegawai [] karyawan = new Pegawai[6];

        for (int i = 0; i < karyawan.length-1; i++) {
            if (i == 0) {
                karyawan[i] = new Manajer();
                Manajer manj = (Manajer) karyawan[i];
                manj.setTunjangan((int) (Math.random() * 5000));
            } else if (i == 1) {
                karyawan[i] = new Sekretaris();
            } else {
                karyawan[i] = new Sales();
                Sales sales = (Sales) karyawan[i];
                sales.setKomisi((int) (Math.random() * 1000));
            }
            karyawan[i].setGaji(1000);
            karyawan[i].setNip((i + 1) * 100);

        }
        karyawan[5] = new IT();
        karyawan[5].setGaji(1000);
        karyawan[5].setNip(6);

        Cabang kantor1 = new Cabang("B0001", "Jln Wahyu Wauwau",
        "E");
        kantor1.setPegawai(karyawan);
        kantor1.cetakGajiTotalSetiapPegawai();

    }
}
