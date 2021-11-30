public class Hayvan {

 void ses_cikar()
 {
     System.out.println("Hayvan ses cikariyor");
 }
 

 public static void main(String[] args) 
 {
     Hayvan[]  x = new Hayvan[4];
     x[0] = new kopek();
     x[1] = new aslan();
     x[2] = new kedi();
     x[3] = new inek();
     
     for (int i=0 ; i<x.length;i++ )
     {
         x[i].ses_cikar();
         
         if( x[i] instanceof aslan )
         {
             System.out.println("aslan aslan sinifina agittir");
         }
         else
             System.out.println("Aslan aslan sinifina agitdegildir");
     }
 }
}


class kopek extends Hayvan{
    void ses_cikar()
    {
        System.out.println("Kopek  haliyor");
    }
    
}
class aslan extends Hayvan{
    void ses_cikar()
    {
        System.out.println("Aslan  ariyor");
    }
    
}
class kedi extends Hayvan{
    void ses_cikar()
    {
        System.out.println("Kedi  myamiyor");
    }
    
}
class inek extends Hayvan{
    void ses_cikar()
    {
        System.out.println("inek  myamiyor");
    }
    
}
