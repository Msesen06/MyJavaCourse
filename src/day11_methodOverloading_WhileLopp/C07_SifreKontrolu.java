package day11_methodOverloading_WhileLopp;

import java.util.Scanner;

public class C07_SifreKontrolu {
    public static void main(String[] args) {
        /*
        kullanicidan asagidaki sartlari saglayan bir sifre isteyin:
        kullanici uygun sifre girinceye kadar sifre istenmeye devam etsin.
         sifrenin kontrolunu bir method'da yapıp sonucu true ya da false dondursun
         -ilk harf kucuk olmalı
         -son karakter rakam olmalı
         -sifre bosluk icermemeli
         -uzunlugu en az 10 karakter olmalı
         */
        Scanner scanner=new Scanner(System.in);
        String sifre ="";
        boolean sifreGecerliMi=false;
        //sifreGecerliMi =sifreKontrolEt(sifre);



        while (!sifreGecerliMi){
            System.out.println("lütfen sifrenizi girin :");
            sifre= scanner.nextLine();
            sifreGecerliMi =sifreKontrolEt(sifre);
            if (sifreGecerliMi){
                System.out.println("sifre basarıyla kaydedildi.");
            }
        }




    }

   public static boolean sifreKontrolEt(String sifre) {
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
            dogruMu=false;
        }


        return dogruMu;

    }


}
