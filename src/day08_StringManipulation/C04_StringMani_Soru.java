package day08_StringManipulation;

import java.util.Scanner;

public class C04_StringMani_Soru {
    public static void main(String[] args) {

        /* Soru
        Kullanıcıdan bir mail alın
        mail @ icermiyorsa "gecersiz mail"
        mail @gmail.com icermiyorsa "mail gmail olmalı"
        mail @gmail.com ile bitmiyorsa , "mailde yazım hatası var" diye yazdırın

         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz");
        String mail = scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")){
            System.out.println("mail gmail olmalı");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazım hatası var");
        } else {
            System.out.println("mail kaydı basarılı");
        }



    }
}
