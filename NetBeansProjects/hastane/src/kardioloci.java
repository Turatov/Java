
public class kardioloci extends isgucu
{
    private String unvan;

    public kardioloci(String unvan, String ad, String soyad, int kimno) 
    {
        super(ad, soyad, kimno);
        this.unvan = unvan;
    }
    void riskhesapla () throws InterruptedException
    {
        System.out.println(unvan + " Doctor" + getAd() + " tarafindar kalkrizi riski hesaplaniyor" );
        Thread.sleep(3000);
        System.out.println("inceleme basarlama tamamlandi");
    }
    
    void EKGcheck () throws InterruptedException
    {
        System.out.println(unvan + "Doctor" + getAd() + "  Tarafindar hesaplaniyor");
        Thread.sleep(3000);
        System.out.println("EKG basarli cekildi");
    }

    @Override
    void yaka_karti_oku() 
    {
        super.yaka_karti_oku(); 
        System.out.println(" Unvan : " + unvan);
    }
    
    
}
