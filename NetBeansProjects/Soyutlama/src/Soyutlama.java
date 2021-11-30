public abstract  class Soyutlama {
  abstract void  soyut();
  private String isim;
  void isim_oku()
  {
      System.out.println("Benin adim " + isim);
      
  }

    public Soyutlama(String isim)
    {
        this.isim = isim;
    }
    public String getIsim() 
    {
        return isim;
    }

    public void setIsim(String isim) 
    {
        this.isim = isim;
    }

}
