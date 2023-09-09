package Interface.Kantor;

public class IT extends Pegawai{
    private int gajiFungsional;

    
    public void setgajiFungsional(int gajiFungsional) {
        this.gajiFungsional = gajiFungsional;
    }

    public int getgajiFungsional() {
        return gajiFungsional;
    }

    public double getGajiTotal() {
        return getGaji()+gajiFungsional;
    }

    public String toString() {
            return super.toString() + "\ngajiFungsional: " + gajiFungsional
            + "\nGaji : " + getGaji() + "\n================================================"
            + "\nGaji Total: " + getGajiTotal();
    }
}
