package day09_StringManipulation_ForLoop;

import java.util.Scanner;

public class C06_forLoop {
    public static void main(String[] args) {

        // Soru
        // kullanıcıdan iki sayi alin bu sayilar dahil aralarındaki
        // 3 e bolunen sayilari yazdirin
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz :");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz :");
        int sayi2 = scanner.nextInt();
        if (sayi1>=sayi2) {
            System.out.println("ilk sayı ikinci sayidan kücük olmalı");
        } else {

            for (int i = sayi1; i <=sayi2; i++) {
                if (i%3==0) {

                    System.out.print(i+"-");
                }
            }
        }



    }
}
