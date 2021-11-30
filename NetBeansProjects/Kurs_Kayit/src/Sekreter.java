
import java.util.Random;

public class Sekreter 
{
Random random = new Random();

private  String Ad ;
private int Ucret;
private int Check = random.nextInt(20);

    public Random getRandom() 
    {
        return random;
    }

    public void setRandom(Random random) 
    {
        this.random = random;
    }

    public String getAd() 
    {
        return Ad;
    }

    public void setAd(String Ad) 
    {
        this.Ad = Ad;
    }

    public int getUcret() 
    {
        return Ucret;
    }

    public void setUcret(int Ucret) 
    {
        this.Ucret = Ucret;
    }

    public int getCheck() 
    {
        return Check;
    }

    public void setCheck(int Check) 
    {
        this.Check = Check;
    }

    public Sekreter(String Ad) 
    {
        this.Ad = Ad;
    }
    
    void islem_sonuc()
    {
        String s = "Kayit isleminiz  " + Ad + "  tarafindan alinmistir \n "
                + " check numaraniz ile muasebe birimine muuracat ediniz  " 
                + " Check numaraniz :" + Check;
        System.out.println(s);
    }
    

}
