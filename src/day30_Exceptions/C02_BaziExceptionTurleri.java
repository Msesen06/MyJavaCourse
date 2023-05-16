package day30_Exceptions;

public class C02_BaziExceptionTurleri {
    public static void main(String[] args) {

        String str1 =null; //deger degil pointerdır

       // System.out.println(str1.concat("java"));//NullPointerException

        String a="34";//34a yazarsak parseInt() bunu sayıya ceviremez ve exception fırlatır
        String b="55";//NumberFormatException

        int sonuc =Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(sonuc);

        String str ="Java";
        Object obj =str;
        //Integer sayi =(Integer) obj; ClassCastException
        //FileNotFoundExcept
        //IoException
        //RuntimeException
        //ArithmeticException
        //InputMisMatchException


    }
}
