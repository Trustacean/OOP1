package Perusahaan;

public class MainProgram {
    public static void main(String[] args) {
        int jumlahPegawai = 0;
        Pegawai pimpinan = new Pegawai("Budi","female",
        "6278103789","budigiyarti@wahoo.com",
        "Jln. Puncak Komedi no 15",-1,
        13,2025,-17,-1,true); 

        Cabang cabang1 = new Cabang("B0001", "Jln Wahyu Wauwau",
         "E");

        Pegawai [] pegawai = new Pegawai[Cabang.MAX_PEGAWAI];

        pegawai[0] = new Pegawai("Dodi", 001);
        jumlahPegawai++;

        pegawai[1] = new Pegawai("Kepin", 002);
        jumlahPegawai++;

        pegawai[2] = new Pegawai("Asep Bensin", 003);
        jumlahPegawai++;

        cabang1.setPemimpin(pimpinan);

        cabang1.setJumlahPegawai(jumlahPegawai);
        cabang1.setPegawai(pegawai);
        
        cabang1.setGajiPegawai(0, 100);
        cabang1.setGajiPegawai(1, 200);
        cabang1.setGajiPegawai(2, 300);

        Pegawai baru = new Pegawai("Andi", 004);
        cabang1.addPegawai(baru);

        cabang1.printPegawai();
        System.out.println("================================================================");
        cabang1.removePegawai(4);

        cabang1.printPegawai();
        System.out.println("================================================================");
        
        System.out.println(cabang1.findPegawai(002));
        System.out.println(cabang1.findPegawai("Dodi"));
        System.out.println("================================================================");
        
        System.out.println(cabang1.getPegawaiGajiTerbesar());
        System.out.println("================================================================");
        
        System.out.println(cabang1.getPegawaiGajiTerkecil());
        

    }
}
