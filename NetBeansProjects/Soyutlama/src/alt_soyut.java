public class alt_soyut extends Soyutlama
{

    public alt_soyut(String isim) {
        super(isim);
    }

    @Override
    void soyut() {
        System.out.println("Govde halle geldi");
    }

    @Override
    void isim_oku() {
        super.isim_oku(); 
    }

   
   
   
    
}

class calistir
{
    public static void main(String[] args)
    {
        alt_soyut a1 = new alt_soyut("java");
        alt_soyut a2 = new alt_soyut("php");
        a1.isim_oku();
        a1.soyut();
        a2.isim_oku();
        a2.soyut();
        
    }
}

