package day10_NestedForLoop_MethodOlusturma;

public class C13_AsalSayiMiDondurme {
    public static void main(String[] args) {
        // sayının asal veya degil boolean donduren bir method olusturun

        ;
        System.out.println(Asalmi(9));
        /*
        method call sırasında parantez icinde yazdıgımız sayı/variable'lara argument denir.
        method () icinde yazdıgımız variable lara ise parametre denir.
        bunlar uyumlu olmalıdır. olmazsa hata verir.
         */
    }
    public static boolean Asalmi(int sayi){
        boolean asalMi=true;
        if (sayi<2) {
            System.out.println("sayı 2'den buyuk olmalı");
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi%i==0){
                    asalMi =false;
                    break;
                }
            }

        }
        return asalMi;
    }
}
