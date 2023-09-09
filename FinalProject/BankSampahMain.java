package FinalProject;

public class BankSampahMain {
    public static void main(String[] args) {
        Penabung[] penabung = new Penabung[BankSampah.MAX_PENABUNG];
        Pengepul[] pengepul = new Pengepul[BankSampah.MAX_PENGEPUL];
        BankSampah bank = new BankSampah("Jalan Raya");
//Instansiasi Penabung
        for (int i = 0; i < 5; i++) {
            penabung[i] = new Penabung();
            penabung[i].setNama("Penabung "+(i+1));
            penabung[i].setAlamat("Jalan Raya No "+(i+1));
        }
        bank.setPenabung(penabung);
//Instansiasi Pengepul
        for (int i = 0; i < 5; i++) {
            pengepul[i] = new Pengepul("pengepul "+(i+1),i);
        }
        bank.setPengepul(pengepul);
// //Demo setor
        Sampah sampah1 = new Kertas(0.5);
        Sampah sampah2 = new Plastik(0.5);
        Sampah sampah3 = new Logam(5);
        // System.out.println(sampah1);
        // System.out.println(sampah2);
        // System.out.println(sampah3);
        // System.out.println(sampah3.getHarga());
        
        System.out.println(penabung[0]);
        penabung[0].setor(sampah1);
        System.out.println(penabung[0]);
        penabung[1].setor(sampah2);
        penabung[2].setor(sampah3);
        
        // System.out.println(penabung[2]);
//         penabung[2].tarik(10000);
//         System.out.println(penabung[2].getTabungan());
//         System.out.println(penabung[2]);
// //Demo print penabung
//         System.out.println();
//         bank.printPenabung();
// //Demo add penabung
//         System.out.println();
//         bank.addPenabung(new Penabung("Penabung 6", "Jalan Raya No 6"));
//         penabung = bank.getPenabung();

//         bank.printPenabung();
// //Demo remove penabung
//         System.out.println();
//         bank.removePenabung(5);
//         bank.printPenabung();



//         System.out.println(bank);
//         System.out.println();
        
        
//         bank.printPengepul();







        // Kertas sampah1 = new Kertas(0.7);
        // Plastik sampah2 = new Plastik(0.9);
        // Logam sampah3 = new Logam(0.1);

        // System.out.println("===========KERTAS=============");
        // Penabung penabung1 = new Penabung("Dodi", "Jln Jalan");
        // penabung1.setor(sampah1);
        // System.out.println(penabung1);

        // System.out.println("===========PLASTIK=============");
        // penabung1.setor(sampah2);
        // System.out.println(penabung1);

        // System.out.println("============LOGAM=============");
        // penabung1.setor(sampah3);
        // System.out.println(penabung1);
        // System.out.println();
        // System.out.println(sampah1);
        // System.out.println(sampah2);
        // System.out.println(sampah3);

        // System.out.println("============PENGEPUL=============");
        // Pengepul pengepul1 = new Pengepul("Dodot", 2);
        // System.out.println(pengepul1.toString());

    }

}
