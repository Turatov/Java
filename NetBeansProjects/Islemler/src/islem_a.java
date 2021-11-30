public class islem_a
{
 public interface Toplama
 {
    int toplama_yap();
 }
 Toplama t1 (int a , int b)
 {
     return new Toplama()
     {
         public int toplama_yap()
         {
             return a + b ;
         }
     };
 }
}
