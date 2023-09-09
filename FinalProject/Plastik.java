package FinalProject;

public class Plastik extends Sampah{
    //  Constant
    final double hargaPerKg=2500;
    //  Constructors
    Plastik() {
        super();
    }

    Plastik(double berat) {
        super(berat);
    }
    //  Harga
    public double getHarga() {
        return getBerat()*this.hargaPerKg;
    }
    //  ToString
    @Override
    public String toString() {
        return String.format("Sampah Plastik Seberat : %1$s Kg",super.berat);
    }
}
