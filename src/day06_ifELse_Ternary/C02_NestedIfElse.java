package day06_ifELse_Ternary;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {
        /*
         SORU
         kullanıcıdan cinsiyetini ve yasını alın
         kadın 60 ve üzeri emekli oalbilir
         erkek 65 ve üzeri emekli olabilir
         emekli olabilirsin veya emekli olmak için su kadar yıl çalışman gerekir yazdırın

         yas veya cinsiyetten birini ana degisken secip ona gore sartlar kontrol edilir
        */
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen yaşınız giriniz :");
        int yas =scanner.nextInt();
        System.out.println("lütfen cinsiyetiniz yazın kadın K , erkek ici E");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("lütfen isminizi giriniz");
        String isim = scanner.next().toUpperCase();

        if (cinsiyet=='K') {
            if (yas<10 || yas >80){
                System.out.println(isim+" hanım yas gecersiz");
            } else if (yas>60) {
                System.out.println("Emekli olabilirsiniz " +isim+ " hanım");
            }
            else {
                System.out.println(isim+ " hanım emekli olmak için daha "+(60-yas)+" yıl çalışmanız gerekir");
            }

        } else if (cinsiyet=='E') {
            if (yas<10 || yas >80){
                System.out.println(isim +" bey yas gecersiz");
            } else if (yas>65) {
                System.out.println("Emekli olabilirsiniz " +isim+ " bey");
            } else {
                System.out.println(isim+ " bey emekli olmak için daha "+(65-yas)+" yıl çalışmanız gerekir");
            }

        } else  {
            System.out.println(cinsiyet+" Gecersiz cinsiyet");
        }
    }
}
