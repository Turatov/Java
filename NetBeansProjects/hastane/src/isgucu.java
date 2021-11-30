public class isgucu {
    private String ad;
    private String soyad;
    private int kimno;

    public isgucu(String ad, String soyad, int kimno) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimno = kimno;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getKimno() {
        return kimno;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setKimno(int kimno) {
        this.kimno = kimno;
    }
    
    void yaka_karti_oku()
    {
        System.out.println(" Adi: " + ad);
        System.out.println(" Soyadi: " + soyad );
        System.out.println(" Kimlik NO: " + kimno);
    }
}