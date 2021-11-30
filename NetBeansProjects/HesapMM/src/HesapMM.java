import java.util.Scanner;

public class HesapMM
{
    public static class toplama
    {
        void toplama_yap(int a, int b, int c)
        {
            int sonuc = a + b + c;
            System.out.println("toplami " + sonuc);
        }
    }
    
    public static class cikartma 
    {
        public void cikarma_yap(int a, int b, int c)
        {
            int sonuc = a - b - c;
            System.out.println("Cikartmasi: " + sonuc);
        }
    }
    
    public static class carpma
    {
        public void carpma_yap(int a, int b)
        {
            int sonuc = a * b;
            System.out.println("Cikartmasi: " + sonuc);
        }
    }
    
    public static class bolme
    {
        public void bolum_yap(double a, double b)
        {
            double sonuc = a / b;
            System.out.println("Cikartmasi: " + sonuc);
        }
    }
    
    public static void main(String[] args) 
    {
        HesapMM.toplama top = new HesapMM.toplama();
        HesapMM.cikartma cik = new HesapMM.cikartma();
        HesapMM.carpma carp = new HesapMM.carpma();
        HesapMM.bolme bol = new HesapMM.bolme();
        
        String t = "Toplama icin: +  " +
                "\n Cikartma icin: - " +
                "\n Capma icin: * " +
                "\n Bolme icin: / " + 
                "Cikis icin: 0 ";
        
        Scanner scan = new Scanner(System.in);
        int bul = 1;
        while (bul == 1)
        {            
            System.out.println(t);
            String secim = scan.nextLine();
            
            if (secim.equals("+"))
            {
                System.out.print("'A' sayisin yaziniz ");
                int sayi1 = scan.nextInt();
                System.out.print("'B' sayisin yaziniz ");
                int sayi2 = scan.nextInt();
                System.out.print("'C' sayisin yaziniz ");
                int sayi3 = scan.nextInt();
                
                top.toplama_yap(sayi1, sayi2, sayi3);
            }
            
            else if (secim.equals("-"))
            {
                System.out.print("'A' sayisin yaziniz ");
                int sayi1 = scan.nextInt();
                System.out.print("'B' sayisin yaziniz ");
                int sayi2 = scan.nextInt();
                System.out.print("'C' sayisin yaziniz ");
                int sayi3 = scan.nextInt();
                
                cik.cikarma_yap(sayi1, sayi2, sayi3);
            }
            
            else if (secim.equals("*"))
            {
                System.out.print("'A' sayisin yaziniz ");
                int sayi1 = scan.nextInt();
                System.out.print("'B' sayisin yaziniz ");
                int sayi2 = scan.nextInt();
                
                carp.carpma_yap(sayi1, sayi2);
            }
            
            else if (secim.equals("/"))
            {
                System.out.println("Bolmek sa");
                
                System.out.print("'A' sayisin yaziniz ");
                int sayi1 = scan.nextInt();
                System.out.print("'B' sayisin yaziniz ");
                int sayi2 = scan.nextInt();
                
                bol.bolum_yap(sayi1, sayi2);
                
               
            }
            
            else if (secim.equals(0))
                bul = 0 ;
            
        }
        
    }
}