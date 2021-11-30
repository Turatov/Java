public class noroloji extends isgucu 
{
    private String universitet;

    public noroloji(String universitet, String ad, String soyad, int kimno) {
        super(ad, soyad, kimno);
        this.universitet = universitet;
    }
    
    void uykubuzuklu () throws InterruptedException
    {
        System.out.println("Uyku buzukluyogu hesaplaniyor"  );
        Thread.sleep(3000);
        System.out.println("Uyku buzuklugu basarli gecti");
    }
    
    void BasAgrisi () throws InterruptedException
    {
        
        System.out.println("Bas agrisi tedaf ediliyor");
        Thread.sleep(3000);
        System.out.println("Bas agrisi basarli tamamlandi");
    }

    @Override
    void yaka_karti_oku() {
        super.yaka_karti_oku();
        System.out.println("Diplom aldigi kurumu : " + universitet);
    }
    
    
}
