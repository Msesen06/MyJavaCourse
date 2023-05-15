package day11_methodOverloading_WhileLopp;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        /*
        tekrar sayisi tam olarak belli olmayan looplarda(döngülerde) while kullanilir
        ornegin: kullanicinin 3 ile bolunebilen bir sayi girene kadar scanner calistirmak gibi
        tekrar sayisi farki bir sarta baglı olan durumlarda while loop kullanilir..
         */
        Scanner scanner=new Scanner(System.in);


        // while icine sart yazilir o sart saglanmadığı sürece kod tekrar eder.
        int sayi =1;
        while (sayi%3!=0){
            System.out.println("lütfen bir sayi girin");
            sayi = scanner.nextInt();
            if (sayi%3==0){
                System.out.println("sayı 3 e bolunuyor");
            } else {
                System.out.println("sayı 3 e bolunemiyor");
            }
        }

    }

}
