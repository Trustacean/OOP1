package FinalProject;

public class Kertas extends Sampah {
    //  Constant
    final double hargaPerKg=1500;
    //  Constructors
    Kertas() {
        super();
    }

    Kertas(double berat) {
        super(berat);
    }
    //  Harga
    public double getHarga() {
        return getBerat()*this.hargaPerKg;
    }
    //  ToSTring
    @Override
    public String toString() {
        return String.format("Sampah Kertas Seberat : %1$s Kg",this.berat);
    }
}
