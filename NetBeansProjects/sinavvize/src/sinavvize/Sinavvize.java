package sinavvize;

import java.util.Scanner;

class Sinavvize {

    public static void main(String[] args) throws InterruptedException 
    {
        String ad = "Yryskeldi";
        String soyad = "Turatov";
        String ogrno = "1935.10005";
        System.out.println("Merhaba  " + ad + "  " + soyad + "  " + ogrno );
        
        Scanner ola = new Scanner(System.in);
        String sifre = "12345";
        System.out.print("Sifrenizi giriniz :");
        String check = ola.nextLine();
        System.out.println("Sifreniz contril ediliyor \n BEKLENIZ");
        Thread.sleep(3000);
        if (sifre.equals(check))
            System.out.println("Giris basarili");    
        else 
            System.out.println("Giris basarsiz");
        
    }
    

}
