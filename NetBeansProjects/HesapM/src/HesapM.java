import java.util.Scanner;


public class HesapM {

    public static class Toplam{
        void toplama_yap(int a, int b, int c){
            int sonuc=a+b+c;
            System.out.println("a"+"b"+"c"+sonuc);
        }
    }

public static class Cikarma{
    void cikarma_yap(int a, int b, int c){
        int sonuc=a-b-c;
            System.out.println("a"+"b"+"c"+sonuc);
    }
    }
 public static class Carpma{
        void carpma_yap(int a, int b, int c){
            int sonuc=a*b*c;
            System.out.println("Carpma:"+sonuc);
        }
}

public static class Bolme{
    void bolme_yap(double a, double b){
       double sonuc=a/b;
            System.out.println("Bolme:"+sonuc);
}
}
    public static void main(String[] args) {
        String Giris="Toplama icin 1e\n"
                + "Cikarma icin 2e\n"
                + "Carma icin 3e\n"
                + "Bolme icin 4e\n"
                +"Cikis icin 5e \n"
                + "Basiniz";
        while (true) {
            System.out.println(Giris);
            Scanner S=new Scanner(System.in);
            String cevap=S.nextLine();
           
            if(cevap.equals("1")){
                System.out.println("Toplamak icin sayinizi giriniz");
                System.out.println("1. satyi gir");
                int s1=S.nextInt();
                System.out.println("2. sayiyi giriniz");
                int s2=S.nextInt();
                System.out.println("3. sayiyi giriniz");
                int s3=S.nextInt();
               
                HesapM.Toplam t1=new HesapM.Toplam();
                t1.toplama_yap(s1, s2, s3);
                        }
            else if(cevap.equals("2")){
                System.out.println("Cikarma icin sayinizi giriniz");
                System.out.println("1. satyi gir");
                int s1=S.nextInt();
                System.out.println("2. sayiyi giriniz");
                int s2=S.nextInt();
                System.out.println("3. sayiyi giriniz");
                int s3=S.nextInt();
               
                HesapM.Cikarma t1=new HesapM.Cikarma();
                t1.cikarma_yap(s1, s2, s3);
                        }
               else if(cevap.equals("3")){
                System.out.println("Carmak icin sayinizi giriniz");
                System.out.println("1. satyi gir");
                int s1=S.nextInt();
                System.out.println("2. sayiyi giriniz");
                int s2=S.nextInt();
                System.out.println("3. sayiyi giriniz");
                int s3=S.nextInt();
               
                HesapM.Carpma t1=new HesapM.Carpma();
                t1.carpma_yap(s1, s2, s3);
                        }
             else if(cevap.equals("4")){
                System.out.println("Bolmekicin sayinizi giriniz");
                System.out.println("1. satyi gir");
                int s1=S.nextInt();
                System.out.println("2. sayiyi giriniz");
                int s2=S.nextInt();
               
               
                HesapM.Bolme t1=new HesapM.Bolme();
                t1.bolme_yap(s1, s2);
        }
             else if(cevap.equals("5")){
                 System.out.println("Hosa kalin");
                 return;
                   }
             else{
                 System.out.println("Hatali islem yaptiniz");
                 break;
             }
    }
       
       
       
       
     
    }  
    }