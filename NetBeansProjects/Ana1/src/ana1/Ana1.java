
package ana1;

public class Ana1 {

    public static void main(String[] args)
    {
        telefon telefon1 = new telefon("Samsung", "A50" , 5);
        telefon telefon2 = new telefon("Iphone ", "ProMax" , 10);
        telefon telefon3 = new telefon("Tedmi ", "TOl" , 100);
        
        telefon1.goster();
        telefon2.goster();
        telefon3.goster();
    }
    
}

class telefon
{
    String Marka;
    String Model;
    int ram;
    
    public   telefon(int ram, String Marka)
    {
    
    }

    public telefon(String Marka, String Model, int ram) 
    {
        this.Marka = Marka;
        this.Model = Model;
        this.ram = ram;
    }
telefon telefone1;    
telefon telefone2;
telefon telefone3;
    public void goster()
    {
        System.out.println("telefonun markasi : " + this.Marka);
        System.out.println("telefonun modeli : " + this.Model);
        System.out.println("telefonun rami : " + this.ram);
        
    }
    
}