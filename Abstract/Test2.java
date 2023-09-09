package Abstract;

public class Test2 {
    public static void main(String[] args) {
        Pegawai [] karyawan = new Pegawai[5];

        for (int i = 0; i < karyawan.length; i++) {
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
        
        Cabang kantor1 = new Cabang("B0001", "Jln Wahyu Wauwau",
        "E");
        kantor1.setPegawai(karyawan);
        kantor1.cetakGajiTotalSetiapPegawai();

        System.out.println("Tunjangan :");
        karyawan[0].cetakGajiTunjangan();
        karyawan[3].cetakGajiTunjangan();
    }
}
