 public class GS
    {
    private int sayi ;   

    public int getSayi()
    {
        return sayi;
    }

    public void setSayi(int sayi)
    {
        this.sayi = sayi;
    }
    }
 
   
    class merhaba
    {
         public  static void main(String[] args)
         {
              GS nesne = new GS(); 
              nesne.setSayi(123);
              int S  = nesne.getSayi();
              System.out.println(S);
         }
    }