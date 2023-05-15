package day29_Exceptions;

public class C06_CatchBlogu_e_Kullanimi {
    public static void main(String[] args) {
        int sayi1 =10;
        int sayi2 =0;
         try {
             //hata yoksa calısır.
             //varsa hicbiri calısmaz ıgnore edilir
             System.out.println(sayi1/sayi2);
             System.out.println("Acıklama 1");
             System.out.println("Acıklama 2");
             System.out.println("Acıklama 3");

         }catch (ArithmeticException e){
             /*
             e exception ı atayabilecegimiz bir variable
             blok icerisinde hazır method veya kendimiz olusturacagmız method
             ve mesajları yazdırabiliriz
              */

             e.printStackTrace();//exceptiondaki tum hata meesajını yazdırır. yoluna devam eder
             System.out.println(e.getMessage());//mesajı yazdırır
         }
        System.out.println("catch blok sonrası");
    }
}
