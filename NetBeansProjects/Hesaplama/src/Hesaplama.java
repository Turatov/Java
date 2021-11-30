
import java.util.Scanner;

public abstract class Hesaplama 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    System.out.print("Karenin alani  giriniz  : ");
    double r = scan.nextDouble();
    System.out.print("Dayrenin alani giriniz  : ");
   
    
    
    double p = scan.nextDouble();
    Hesaplama kare = new kare(r);
    Hesaplama dayre = new Dayre(p);
        System.out.print("Karenin alani " + kare.alan());
        System.out.println(" ");
        System.out.println("Dayrenin alani " + dayre.alan());
        
    }
    
    
abstract double alan();   


    
}


