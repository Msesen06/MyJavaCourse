package day09_StringManipulation_ForLoop;

import java.util.Scanner;

public class C02_StringMani {
    public static void main(String[] args) {

        /*
        /Soru kullanıcıdan bir sifre isteyin asgıdaki sartların hepsini tasıyorsa
        "sifre basarıyla kaydedildi " yazdırın:
        -ilk harf kucuk olmalı
        -son karakter rakam olmalı
        -sifre bosluk icermemeli
        -uzunlugu en az 10 karakter olmalı
        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen sifrenizi girin");
        String sifre = scanner.nextLine();
        boolean dogruMu =true;

            if (!(sifre.charAt(0)<='z'&& sifre.charAt(0)>='a')) {
                System.out.println("ilk karakter kucuk harf olmalı ");
                dogruMu =false;
            }
           char sonharf =sifre.charAt(sifre.length()-1);
            if (!(sonharf<='9' && sonharf>='0')) {
                System.out.println("son karakter rakam olmalı");
                dogruMu =false;
            }
            if (sifre.contains(" ")){
                System.out.println("sifre bosluk icermemeli");
                dogruMu=false;
            }
            if (sifre.length()!=10) {
                System.out.println("sifre en az 10 karakter olmalı");
            }

            if (dogruMu==true){
                System.out.println("sifre basarıyla kaydedildi");
            }


    }
}
