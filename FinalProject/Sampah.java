package FinalProject;

public abstract class Sampah implements Berharga{
    //  Attribute
    protected double berat;  
    
    Sampah() {
        this.berat = 0;
    }
    Sampah (double berat) {
        if (berat < 0) {
            this.berat = 0;
        } else {
            this.berat = berat;
        }
    }
    //  Berat
    public void setBerat(double berat) {
        if (berat < 0) {
            this.berat = 0;
        } else {
            this.berat = berat;
        }
    }

    public double getBerat() {
        return berat;
    }
    //  Harga
    public abstract double getHarga();
    //  ToString
    public String toString() {
        return String.format("Sampah Seberat : %1$s Kg",this.berat);
    }
}
