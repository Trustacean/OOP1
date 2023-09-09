package Perusahaan;

public class Main {
    public static void main(String[] args) {
        Sales sales1 = new Sales();
        sales1.setWages(1000);
        sales1.setKomisi(700);
        System.out.println(sales1);
        System.out.println();
        Manajer manajer1 = new Manajer();
        manajer1.setWages(1000);
        manajer1.setTunjangan(1200);
        System.out.println(manajer1);
        System.out.println();
        Sekretaris sekre1 = new Sekretaris();
        sekre1.setWages(1000);
        System.out.println(sekre1);
    }
}
