package day01_05;

import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        dersTarihi();

        /*
        data türleri
        primitive data
        boolean/ char/ float double /  byte short int long
         */
        char harf ='f';
        float sayi1 =3.1422f;
        double sayi2 =3.244444;

        // non primitive data türleri/ objects
        /*
        1- classlar
        2- interfaceler
        3- arrays
         */

        String metin = "Java Candır";
        System.out.println(metin.toLowerCase());
        System.out.println(metin.toUpperCase());
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir isim yazınız");
        String isim =scan.nextLine();
        isim =isim.toUpperCase();
        System.out.println("isminiz :"+isim+"'dir.");
/*
        System.out.println("lütfen bir tamsayı girin");
        int sayi= scan.nextInt();
        System.out.println("lütfen bir ondalıklı bir sayı girin");
        double sayi3= scan.nextInt();
        System.out.println("girilen sayıların çarpımı : " + sayi*sayi3); */
        System.out.println("lütfen isminizi giriniz :");
        char isim1=scan.nextLine().toUpperCase().charAt(0);
        System.out.println("lütfen soyisminizi giriniz :");
        String soyisim =scan.nextLine().toUpperCase();
        System.out.println("lütfen yaşınızı giriniz :");
        int yas =scan.nextInt();
        System.out.println("Girilen Bilgiler : "+isim1+" "+soyisim+", "+yas);
        System.out.println("lütfen birinci sayıyı girin");
        int s1=scan.nextInt();
        System.out.println("lütfen ikinci sayıyı girin");
        int s2=scan.nextInt();
        //2 ve 4
        s2=s1;




        System.out.println(s1+" / " +s2);



    }

    public static void dersTarihi() {

        System.out.println("21 mart 2023 saat 11");
    }
}
