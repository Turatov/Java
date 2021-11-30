
import java.util.Scanner;

 class kare {
     int kenar ;

    void    alan ()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Karenin kenarin  giriniz  :");
        kenar = scan.nextInt();
        System.out.println("Karenin alani  " + kenar * kenar );
    }
    
    public static void main(String[] args) 
    {
    kare ola  = new kare();    
    ola.alan();
    }
}
