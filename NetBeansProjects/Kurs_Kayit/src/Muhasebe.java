import java.util.Scanner;
public class Muhasebe 
{
private String ad;

    public Muhasebe(String ad) {
        this.ad = ad;
    }
    
    public void degerlendirme(Sekreter  s) throws InterruptedException
    {
        int i = 0;
        while(true)
        {
            Scanner scanner = new Scanner(System.in);
                     int checkno;
                     String a =  "Ben mihaseden  " + ad +  "  Lutfen  fotograf numarasini girin";
                     System.out.print(a);
                     checkno = scanner.nextInt();
                     if (checkno == s.getCheck())
                     {
                         System.out.println("Chekiniz kontrol edilior");
                         Thread.sleep(3000);
                         String m = "Muhaseben sorumlu " + ad + " chekinizi kontrol edti \n" 
                                 + "CheKINIZI GDOGRU OLDUgu goruldu \n "
                                 + "Kursunuza kos geldiniz ";
                         System.out.println(m);
                         return;
                         
                     }
                     else
                     { 
                          System.out.println("Chekiniz kontrol edilior");
                         Thread.sleep(3000);
                         String m1 = "Muhaseben sorumlu " + ad + " chekinizi kontrol edti \n" 
                                 + "CheKINIZI yanlis oldugu goruldu  \n"
                                 + "chekno unuzu eniden giriniz ";
                         System.out.println(m1);
                         }
        }
    }

   }

