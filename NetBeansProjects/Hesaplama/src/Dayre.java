
public class Dayre extends Hesaplama
{

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    private double yaricap;
    @Override
    double alan() {
        return Math.PI*(yaricap);
    }

    public Dayre(double yaricap) {
        this.yaricap = yaricap;
    }
    
}
