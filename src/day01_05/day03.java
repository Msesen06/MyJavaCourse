package day01_05;

import java.util.Scanner;

public class day03 {

    public static void dersTarihi(){
        System.out.println("22 mart 2023 Çarşamba");
    }
    public static void main(String[] args) {
        dersTarihi();
        /*
            data casting dönüşüm işlemleri
            buyuge kucugu atarken otomatik kabul eder
            ama kucuge buyugu atarken onune yuvarlak parantez icinde data turunu belirtmemiz gerekiyor

        */
        int sayi =515; // byte 256 deger aldıgı için buyuk sayıyı 256 ya boler ve kalanı yazdırır
        long lng =sayi;// auto widening
        byte byt=(byte) sayi; //
        System.out.println(byt);


        char ch1='A';
        char ch2 ='B';
        System.out.println("karakter :" + (ch1+ch2));

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir harf girin");
        char harf= scan.nextLine().charAt(0);
        System.out.println("girdiğiniz harften sonraki 3 harfin ascıı karsılıgı sunlardır : \n"+(char)(harf+1)+"\n"+
                (char)(harf+2)+ "\n"+ (char)(harf+3));

        int sayi2 =10;
        boolean bl = true;
        char chr ='K';
        String str = sayi2+" ";
        System.out.println(str.charAt(0)); //1
        str=bl+"";
        System.out.println(str.charAt(1));//t


            /*
               primitive data türlerinin hazır methodları yoktur.
               ancak java bunun için bazı wrapper classlar olusturmustur.
               wrapp class diger tüm pritimive data türlerine casting yapılmadan atama
               yapılabilir.

             */


        Integer sayi1=10;
        sayi1=sayi2;
        System.out.println(sayi1.intValue());

        String s1 ="34";
        String s2="45";
        System.out.println((Integer.parseInt(s1) + Integer.parseInt(s2)));

        char karakter ='d';
        System.out.println(Character.toUpperCase(karakter));
        System.out.println(Character.isAlphabetic(karakter));
        System.out.println(Character.isDigit(karakter));

        /*
          modulus kalan bulma %2

       */

        int sayi3=123;
        System.out.println(sayi3 % 5);

        System.out.println("lütfen bir tam sayı girin");
        int girilen =scan.nextInt();
       int birlerBas=0;
       int rakamlarTop=0;
       birlerBas=girilen%10;
       rakamlarTop=rakamlarTop+birlerBas;
       girilen=girilen/10;
       birlerBas= girilen%10;
       rakamlarTop=rakamlarTop+birlerBas;
       girilen=girilen/10;
       birlerBas =girilen%10;
       rakamlarTop=rakamlarTop+birlerBas;
        System.out.println(rakamlarTop);





    }


}
