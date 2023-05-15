package day29_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_try_catch {
    public static void main(String[] args) {
        //kullanıcıdan iki tam sayı alıp
        //kullanıcı tam sayı girmezse yeniden tamsayı istesin
        //ilk sayıyı ikinciye bolun
        // ve sonucu yazdırın

        Scanner scanner =new Scanner(System.in);
        boolean sayiIste =true;

        int sayi1=0;

        while (sayiIste){
            try {
                System.out.println("bolunecek sayıyı girin :");
                sayi1 = scanner.nextInt();
                sayiIste=false;
            } catch (InputMismatchException e) {
                String  temp = scanner.next();
                System.out.println("giris tamsayı olmalı");
            }
        }
        sayiIste =true;
        int sayi2=0;
        while (sayiIste){
            try {
                System.out.println("bolen sayıyı girin :");
                sayi2 = scanner.nextInt();
                sayiIste=false;
            } catch (InputMismatchException e) {
                String  temp = scanner.next();
                System.out.println("giris tamsayı olmalı");
            }
        }
        try {
            System.out.println("iki sayının bolme sonucu :"+sayi1/sayi2);
        } catch (ArithmeticException e) {
            System.out.println("2. sayı 0 olamaz");
        }

    }
}
