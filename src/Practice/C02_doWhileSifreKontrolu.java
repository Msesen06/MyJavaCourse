package Practice;

import java.util.Scanner;

public class C02_doWhileSifreKontrolu {


    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
            - Sifre kucuk harf icermelidir
            - Sifre buyuk harf icermelidir
            - Sifre ozel karakter icermelidir
            - Sifre en az 8 karakter olmalidir
         */


        Scanner scanner = new Scanner(System.in);
        boolean DogruMu;
        do {
            System.out.println("lütfen şifrenizi giriniz ");
            String sifre = scanner.nextLine();
            DogruMu = sifreKontolEt(sifre);
            if (DogruMu) {
                if (sifre.length() > 16) {
                    System.out.println("sifre cok guclu");
                } else if (sifre.length()>12) {
                    System.out.println("sifre guclu");
                }

                System.out.println("Sifreniz kabul edilmistir. Giris basarılı");
            }

        } while (!DogruMu);
    }

    public static boolean sifreKontolEt(String sifre) {
        boolean dogruMu = true;
        int rakam = 0;
        int ozelKarakter = 0;
        int kucukHarf = 0;
        int buyukHarf = 0;

        for (int i = 0; i < sifre.length(); i++) {
            if (Character.isDigit(sifre.charAt(i))) {
                rakam++;
            }
            if (Character.isLowerCase(sifre.charAt(i))) {
                kucukHarf++;
            }
            if (Character.isUpperCase(sifre.charAt(i))) {
                buyukHarf++;
            }
            if (sifre.charAt(i) <= 47 && sifre.charAt(i) >= 32) {
                ozelKarakter++;
            }
        }

        if (sifre.length() < 8) {
            System.out.println(" en az 8 karakter olmalı");
            dogruMu = false;
        }

        if (rakam == 0) {
            System.out.println("sifre en az bir rakam icermeli");
            dogruMu = false;
        }
        if (ozelKarakter == 0) {
            System.out.println("sifre en az bir ozel karakter" +
                    "(!, \", #, $, %, ', (, ), *, +, ., -, ,/) icermeli");
            dogruMu = false;
        }
        if (kucukHarf == 0) {
            System.out.println("sifre en az bir kucuk harf icermeli");
            dogruMu = false;
        }
        if (buyukHarf == 0) {
            System.out.println("sifre en az bir buyuk harf icermeli");
            dogruMu = false;
        }
        return dogruMu;
    }
}
