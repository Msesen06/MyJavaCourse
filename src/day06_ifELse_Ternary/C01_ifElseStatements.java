package day06_ifELse_Ternary;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {
        // 28 Mart 2023 Salı

        /*
         else body si ile bitmelidir
         soru kullanıcıdan cinsiyetini ve yasını alın
         kadın 60 ve üzeri emekli oalbilir
         erkek 65 ve üzeri emekli olabilir
         emekli olabilirsin veya emekli olmak için su kadar yıl çalışman gerekir yazdırın
        */

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen yaşınız giriniz :");
        int yas =scanner.nextInt();
        System.out.println("lütfen cinsiyetiniz yazın kadın K , erkek ici E");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        if ((cinsiyet!='K' && cinsiyet!='E') || yas<10 || yas>80){
            System.out.println("Geçersiz Giriş");
        }
        else if ((cinsiyet=='K' &&yas>=60) || (cinsiyet=='E' && yas>=65)){
            System.out.println("Emekli olabilirsiniz");
        }
        else if (cinsiyet=='K' && yas<60) {
            System.out.println("emekli olmak için daha "+(60-yas)+" yıl çalışmanız gerekir");

        }
        else if (cinsiyet=='E' && yas<65) {
            System.out.println("emekli olmak için "+(65-yas)+" yıl daha çalışmanız gerekir");
        }


        //SORU kullanıcıdan bir sayı isteyin sayı 4 sartı saglıyorsa mükemmel sayı yazdırın
        // ve sağlamayan tüm sartları yazdırın
        /*
            1- sayı 4 basamaklı olmalı 2- sayı 3ile bölünebilmeli 3-sayı 5 ile bölünememeli
            4-sayı tek olmalı


       */
        System.out.println("lütfen bir sayı girin");
        int sayi =scanner.nextInt();
        boolean sayiMukemmelMi=true;
        if (sayi<100 || sayi>9999) {
            System.out.println("Sayı 4 basamaklı olmalıdır");
            sayiMukemmelMi =false;
        }
        if (sayi%3!=0){
            System.out.println("sayı 3'e bölünmüyor");
            sayiMukemmelMi=false;
        }
        if (sayi%5==0){
            System.out.println("sayı 5'e tam bölünüyor");
            sayiMukemmelMi=false;
        }
        if (sayi%2==0){
            System.out.println("sayı tek sayı degil");
            sayiMukemmelMi=false;
        }
        if (sayiMukemmelMi){
            System.out.println("sayı mükemmel sayıdır");
        }




    }
}
