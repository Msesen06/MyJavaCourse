package day01_05;

import java.util.Scanner;

public class day04 {
    public static void dersTarihi(){
        System.out.println("23 mart 2023 perşembe");
    }

    public static void main(String[] args) {
        dersTarihi();

        // increment deger arttırma
        int sayi=10;
        sayi =sayi+3;
        sayi=sayi*4;
        sayi=sayi-12;
        sayi+=5;
        sayi++;
        System.out.println(sayi);
        sayi-=5;
        System.out.println(sayi);

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir sayı girin");
        int girilen=scan.nextInt();

        System.out.println(++girilen);
        System.out.println(girilen++);

        int a =10;
        System.out.println(a++);

        int b = a++; // önce atama var sonra artırma
        System.out.println("a : "+a+" b :"+b);
        --a;
        ++b;
        System.out.println(a+"  , " + --b);
        int c =a++ + ++b; // a:12 b:12 c:23
        System.out.println("a : "+a+" b :"+b+ " , c :"+ ++c);
        String str1 ="merhaba";
        String str2 ="dünya";
        int c1 =23;
        int c2 =32;

        System.out.println(str1+c1+c2 );
        System.out.println(""+c1+c2+str2);


        // karsılastırma operatorleri
        /*
        == esittir
        != esit degildir
        > < buyuk kucuk
        a b den kucuk degil  !(a <b)


        mantıksal operatorler
        && ve operatoru
        & tek ve sonuna kadar gider

        || veya operatoru


         */
        boolean c3 =2*c1>=c2 & c1>25;
        System.out.println(c3);








    }
}
