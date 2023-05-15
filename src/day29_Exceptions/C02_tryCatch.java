package day29_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_tryCatch {
    public static void main(String[] args) {
        //kullanıcıdan iki tam sayı alıp
        //ilk sayıyı ikinciye bolun
        // ve sonucu yazdırın
        Scanner scanner =new Scanner(System.in);
        System.out.println("bolunecek sayıyı girin :");
        int sayi1 = 0;
        try {
            sayi1 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("giris tamsayı olmalı");
        }
        System.out.println("bolen sayıyı girin :");
        int sayi2 = 0;
        try {
            sayi2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("giris tamsayı olmalı");
        }
        /*
        kodumuzu yazarken bir exception olusma ihtimali varsa
        bunu bir try-catch blogu ile cevreleriz
        try-catch temel uc bolumden olusur
        1-try blogu: exception cıkması muhtemel olan kodlar
        2- catch exception: catch keyword ve beklenen exception  turunu  yazdıgımız bolum
        3- catch blogu ongordugumuz exception olustugunda calısmasını istedigimiz kodlar

        Kullanıcının yapması muhtemel hataları tamamıyla ayıklamak genis kapmsamlı
        dusunup tum ihtimalleri cozmek gerekir.
         */
        try {

            System.out.println("iki sayının bolme sonucu :" +sayi1/sayi2);

        } catch (ArithmeticException e) {

            System.out.println("sayılar sıfıra bolunemez");
        }

    }
}
