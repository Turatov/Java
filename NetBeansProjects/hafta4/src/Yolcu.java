public class Yolcu 
{

    private static int yolcu_sayisi = 0 ;
    private  String yolcu_adi;
    private  String durak_adi;

    public static int getYolcu_sayisi() 
    {
        return yolcu_sayisi;
    }

    public String getYolcu_adi()
    {
        return yolcu_adi;
    }

    public String getDurak_adi() 
    {
        return durak_adi;
    }

    public static void setYolcu_sayisi(int yolcu_sayisi)
    {
        Yolcu.yolcu_sayisi = yolcu_sayisi;
    }

    public void setYolcu_adi(String yolcu_adi)
    {
        this.yolcu_adi = yolcu_adi;
    }

    public void setDurak_adi(String durak_adi) 
    {
        this.durak_adi = durak_adi;
    }

    public Yolcu(String yolcu_adi, String durak_adi) 
    {
        this.yolcu_adi = yolcu_adi;
        this.durak_adi = durak_adi;
        
        yolcu_sayisi++;
    }
    
    public void cikti()
    {
        String yolcu_bilgisi = yolcu_adi + " otobusumuze   " + durak_adi + "   duraginda bindi";
        System.out.println(yolcu_bilgisi);
    }
    
   
    
    
    public static void main(String[] args) 
    {
        Yolcu o1 = new Yolcu ("Ayse","'Jal'");
        Yolcu o2 = new Yolcu ("Bek" , "'Politeh'");
        Yolcu o3 = new Yolcu ("Ali" , "'Sum'");
        o1.cikti();
        o2.cikti();
        o3.cikti();
        System.out.println("otobusteki yolcu sayisi " + Yolcu.getYolcu_sayisi());
        
    }
    
}
