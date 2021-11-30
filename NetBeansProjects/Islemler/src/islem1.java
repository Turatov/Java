
import java.util.Scanner;

public class islem1 
{
    public static void main(String[] args) 
    {
        class toplama
        {
        void toplama_yap(int a , int b)
        {
            int sonuc = a + b;
            System.out.println(sonuc);
        }
        
        void cikarma (int a , int b)
        {
            int sonuc = a-b;
            System.out.println(sonuc);
        }
        
        void carpi(int a, int b)
        {
            int sonuc = a*b;
            System.out.println(sonuc);
        }
         void bolme(int a, int b)
        {
            double sonuc = a/b;
            System.out.println(sonuc);
        }
        
        }
        toplama top = new toplama();
        
        System.out.println("Merhaba ne yapmak istiyorsuunuz");
        while (true)
        {
         Scanner scan = new Scanner(System.in);
         System.out.println("Islem seciniz \n"
        + "+ \n"
        + "- \n"
        + "* \n"
        + "/ \n"
        + "x cikis icin" );
         String s =  scan.nextLine();
      
       // System.out.print("a + b = " );
        
       

switch (s)
{
    
    case "+": 
          System.out.print("birinci sayi giriniz 'a': ");
        int s1 = scan.nextInt();
        System.out.print("ikinci sayi griniz 'b':  ");
        int s2 = scan.nextInt();
        System.out.print ("a + b =  ");
        top.toplama_yap(s1, s2);
        break;
    case "-": 
          System.out.print("birinci sayi giriniz 'a': ");
        int a1 = scan.nextInt();
        System.out.print("ikinci sayi griniz 'b':  ");
        int a2 = scan.nextInt();
        System.out.print ("a - b =  ");
        top.toplama_yap(a1, a2);
        break;
    case "*": 
          System.out.print("birinci sayi giriniz 'a': ");
        int b1 = scan.nextInt();
        System.out.print("ikinci sayi griniz 'b':  ");
        int b2 = scan.nextInt();
        System.out.print ("a * b =  ");
        top.toplama_yap(b1, b2);
        break;
    case "/": 
          System.out.print("birinci sayi giriniz 'a': ");
        int e1 = scan.nextInt();
        System.out.print("ikinci sayi griniz 'b':  ");
        int e2 = scan.nextInt();
        System.out.print ("a / b =  ");
        top.toplama_yap(e1, e2);
        break;
    case "x":
        System.out.println("cikmak istiyormusunuz? 'Y', 'N'");
        String cik = scan.nextLine();
        if (cik.equals("Y")) 
        {
            System.out.println("Hos kalininz");
            return;
        }
        }
      
     }
}
}
