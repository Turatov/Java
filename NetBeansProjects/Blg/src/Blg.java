import java.util.Scanner;

class motor
{

    static motor motor1;

    public motor() 
    {
        System.out.println("Motor olustulurdu");
    }
    
}
public class Blg {


    public static void main(String[] args) 
    {
    
        selam();
        islem();
        islem1(5,10,5);
        System.out.println( "d carpi b = ; " + carpi(20,10));
        motor.motor1 = new motor();
        okul okul1 = new okul();
        okul okul2 = new okul();
        okul okul3 = new okul();
        
        okul1.goster();
        okul2.goster();
        okul3.goster();
        
        telefon telefon1 = new telefon();
        telefon telefon2 = new telefon();
        
        telefon1.Marka=" samsung ";
        telefon1.Model=" A502 ";
        telefon1.ram = 8;
        telefon2.ozellikler(8, "Iphone", "Supermax");
        System.out.println(telefon2.Marka + telefon2.Model + telefon2.ram);
        
        
        
        System.out.println("Markasi :" + telefon1.Marka +" Modeli   :" + telefon1.Model+ " Remi  :" +telefon1.ram);
    }
    
    
    public static void selam()
{
    System.out.println("Merhaba");
}
    
    public static void islem()
    {
        Scanner obj  = new Scanner(System.in);
        System.out.print("birinci sayi girin  : ");
        int a = obj.nextInt();
        System.out.print("ikinci sayi girin : ");
        int b = obj.nextInt();
        System.out.println("Bolme  : " + a/b);
    }
    
    public static void islem1(int a,int  b)
    {
        System.out.println("Toplam a + b + c = :"  + a + b);
        
    }
    
    public static void islem1(int a,int  b , int c )
    {
        System.out.println("Toplam a + b = :"  + (a + b+ c));
        
    }
    
    public static int carpi(int d, int e)
    {
        return (d /e);
    }
}

class okul
{
    int yas = 100;
    String adi =" pop";
    int numara = 193510005;
    
    
    void goster( )
    {
        System.out.println(numara + "  " + adi + "  " + yas );
    }
}

class telefon
{
    String Marka;
    String Model;
    int ram;
    
    public  void ozellikler(int ram, String model, String Marka)
    {
        this.ram = ram;
        this.Marka=Marka;
        this.Model=model;
    }
}