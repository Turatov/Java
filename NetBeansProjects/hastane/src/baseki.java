public class baseki extends isgucu {

    private String uzmanlik_alani;
    private String unvan;
    private int hizmet;
    
    
    public baseki(String ad, String soyad, int kimno, String uzmanlik_alani, String unvan, int hizmet) {
        super(ad, soyad, kimno);
        
        this.uzmanlik_alani = uzmanlik_alani;
        this.unvan = unvan;
        this.hizmet = hizmet;
    }
    
    void calis () throws InterruptedException
    {
        String s1 = ( "Basakim " + getAd() + " Doktorlarin yildik izimleri control ediliyor... ");
        Thread.sleep(3000);
        String s2 = ( "Basakim " + getAd() + " loboratlar control ediliyor... ");
        Thread.sleep(3000);
        System.out.println(s1);
        System.out.println(s2);
        
       }

    @Override
    void yaka_karti_oku() {
        super.yaka_karti_oku();
        System.out.println("Uzman Alani " + uzmanlik_alani );
        System.out.println("Unvan " + unvan);
        System.out.println("Hizmet suresi " + hizmet);
    }
    
    
   
}