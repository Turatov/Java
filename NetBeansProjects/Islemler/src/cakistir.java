import java.util.Scanner;
public class cakistir 
{
public static void main(String[] args) 
        
{
    Islemler.toplama t1 = new Islemler.toplama();
    Islemler.cikarma j1 = new Islemler.cikarma();

    
Scanner scanner = new Scanner(System.in);
    System.out.print("birinci sayi giriniz 'a': ");
int sayi1 = scanner.nextInt();
    System.out.print("ikinci sayi griniz 'b':  ");
int sayi2 = scanner.nextInt();

System.out.println("Merhaba ne yapmak istiyorsuunuz");
System.out.println("Islem seciniz \n"
        + "+ \n"
        + "-" );
Scanner sec = new Scanner(System.in);
String s =  sec.nextLine();
if (s.equals("+"))
{
        System.out.print("a + b = " );
        t1.toplama_yap(sayi1 ,sayi2);
}
else
{
        System.out.print("a - b = " );
        j1.cikarma_yap(sayi1 ,sayi2);
}
}
   
}
