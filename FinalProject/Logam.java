package FinalProject;

public class Logam extends Sampah{
    //  Constant
    final double hargaPerKg=3000;
    //  Constructors
    Logam() {
        super();
    }

    Logam(double berat) {
        super(berat);
    }
    //  Harga
    public double getHarga() {
        return getBerat()*this.hargaPerKg;
    }
    //  ToString
    @Override
    public String toString() {
        return String.format("Sampah Logam Seberat : %1$s Kg",super.berat);
    }
}
