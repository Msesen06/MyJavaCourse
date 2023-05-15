package day11_methodOverloading_WhileLopp;

import java.util.Scanner;

public class C10_WhileLoopUsHesaplama {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
                kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
                olusturun.

         */



        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen sayının tabanını giriniz :");
        int taban = scanner.nextInt();
        System.out.println("lütfen sayının ussunu giriniz :");
        int us = scanner.nextInt();
        usHesapla(taban,us);

    }
    public static void usHesapla(int taban,int us) {
        int sonuc =1;

        int ustekrar=1;
        while (ustekrar<=us){
            sonuc*=taban;
            ustekrar++;
        }


        System.out.println(taban+" üzeri "+us +" = "+ sonuc);
    }
}
