package day11_methodOverloading_WhileLopp;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan toplanmak uzere tamsayilar isteyin
        kullanici 0'a basana kadar devam etsin
         */
        Scanner scanner=new Scanner(System.in);
        int toplam =0;
        int sayi=1;
        int sayac=0;
        while (sayi!=0){
            System.out.println("lütfen sayi giriniz\nbitirmek ici 0'a basın");
            sayi= scanner.nextInt();
            if (sayi>0){
                toplam+=sayi;
                sayac++;

            } else if (sayi<0){
                System.out.println("sayı pozitif olmalı");
            }



        }
        System.out.println(sayac+" tane pozitif sayının toplamı :"+toplam);


    }
}
