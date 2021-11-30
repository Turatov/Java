
import java.util.Scanner;

public class islem 
{
    
    static String php = "php";
    static String java = "java";
    static String c = "c";
    static int ucret;
    public static void main(String[] args) throws InterruptedException 
    {
        Sekreter s = new Sekreter("Aishe" );
        String giris = "Kayit birimine kos gekdiniz \n"
                + " Ben kur sekreteri   " + s.getAd() + "   kurslarimiz \n 1 = : java  \n 2 = : c \n  3 = : php  \n"
                + " kurs ucretimiz 3000 bin som \n"
                + " kurs ucretimizi pesin vermeniz gerekiyor ";
        System.out.println(giris);
        Scanner scan = new Scanner(System.in);
        System.out.println("Kayit olmadini isteyen kurs adini  giriniz \n"+" 1 = : java  \n 2 = : c \n  3 = : php " );
        String kurs = scan.nextLine();
        switch (kurs) 
        {
            case "3":
                System.out.println("Siz  " + php + "ni  sectiniz kurs ucresi 2500 som");
                break;
            case "1":
                System.out.println("Siz " + java +"ni sectiniz kurs ucresi 3000 som");
                 break;
            case "2":
                System.out.println("Siz " + c  +"ni  sectiniz kurs ucresi 2900 som ");
                break;
                
            default:
                throw new AssertionError();
        }
        System.out.println("Kursa vereceginiz para yaziniz");
        int ucret1 = scan.nextInt();
        switch (kurs)
        {
            case "php":
                ucret = 2500;
                break;
            case "java":
                ucret = 3000;
                break;
            case "c":
                ucret = 2900;
                break;    
                
         
        }
        if ( ucret == ucret1 )
        {
            s.islem_sonuc();
            Muhasebe m = new Muhasebe("Ahmed");
            m.degerlendirme(s);
            
        }
        else if (ucret < ucret1)
        {
            int b;
            b = ucret1 - ucret;
            System.out.println("siz " + b +  "som fazla girdiniz  \n"
            + " devam etmek istiyor musunuz?");
             s.islem_sonuc();
            Muhasebe m = new Muhasebe("Ahmed");
            m.degerlendirme(s);
       
        }
        else 
            System.out.println((ucret1 - ucret) + " para kaldi");
        
    }
}
