
import java.util.Scanner;

public class kare extends Hesaplama
{
   private double kenarA;
    
    @Override
    double alan() {
       return kenarA*kenarA;
    }

    public kare(double kenarA) {
        this.kenarA = kenarA;
    }

    public double getKenarA() {
        return kenarA;
    }

    public void setKenarA(double kenarA) {
        this.kenarA = kenarA;
    }
    
    
}

class  calistir
{
    public static void main(String[] args)
    {
        Scanner lol = new Scanner(System.in);
        double d = lol.nextDouble();
        kare k1 = new kare(5.12);
        kare k2 = new kare(d);
        System.out.println(k2.alan());
        
    }
}