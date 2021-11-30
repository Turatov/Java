import java.util.Scanner;
public class islem 
{
public static void main(String[] args) throws InterruptedException 
{
   baseki b = new baseki("Mehmed", "Usupov", 193510005, "Doctor","kardiologi", 21);
   kardioloci k = new kardioloci("Doctor" , "Ulan", "Tumenov" , 21);
   noroloji n = new noroloji ("KTU Manas " , "Ali" ,"Mehmed", 21);
   
   String komut = "Hastanemize kos keldiniz \n" 
           + " secimden cikmak icin '0'\n"
           + " Basi kim ile islemler icin '1'\n"
           + " kardologi icin icler '2'\n"
           + "norologi icnin isler '3'\n"
           + " ";
   
   Scanner scanner = new Scanner(System.in);
   while (true)
   {
       System.out.println("////////");
       System.out.println(komut);
       System.out.println("////////");
       System.out.println("           ");
       System.out.println("Yapmak istegen isinizi girin");
       String secim = scanner.nextLine();
       while (true)
       {           
       if (secim.equals("0"))
       {
           System.out.println("Sistemden cikiliyor");
           Thread.sleep(3000);
           return;
       }
       else if (secim.equals("1")) 
       {
           System.out.println("Basakime birimine kos geldiniz\n");
           System.out.println("Basakim bilgileri tanimlaniyor...");
           Thread.sleep(3000);
           b.yaka_karti_oku();
           b.calis();
           System.out.println("Basakimin calismasi bitirdi");
           break;

        }
       else if (secim.equals("2"))
       {
           System.out.println("kardeologi birimine kos keldiniz\n");
           System.out.println("Kardeologi bilgileri tanimliyor ...");
           Thread.sleep(3000);
           k.yaka_karti_oku();
           System.out.println("hangi islem istiyorsunuz ? \n"
           + "'1' : EKG  \n"
           + "'2'  :Risk hgesapla \n ");
           String secim2 = scanner.nextLine();
           if (secim2.equals("1"))
           {
               System.out.println("Siz EKG sectiniz \n ");
               Thread.sleep(3000);
               k.EKGcheck();
               break;  
           }
           else if (secim2.equals("2"))
           {
               System.out.println("Siz risk hesaplani sectiniz  \n ");
               Thread.sleep(3000);
               k.riskhesapla();
               break;
           }
           else 
           {
               System.out.println("yanlis yapttiniz");
               break;
           }
     
       }
       else if (secim.equals("3"))
       {
           
           System.out.println("noroji birimine kos geldiniz\n");
           System.out.println("norologi bilgileri tanimlaniyor ");
           n.yaka_karti_oku();
           System.out.println(" '1' :  Basarisi icin \n"
           +" '2' : Uyku buzukluu icin");
           String secim3 = scanner.nextLine();
           if (secim3.equals("1")) 
           {
            n.BasAgrisi();
            break;
           }
           else if (secim3.equals("2"))
           {
           n.uykubuzuklu();
           break;
           }
           
           
       }
       }
       
       
   }
   
   
    
}
    
}
