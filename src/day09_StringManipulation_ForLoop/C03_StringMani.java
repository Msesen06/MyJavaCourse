package day09_StringManipulation_ForLoop;

import java.util.Scanner;

public class C03_StringMani {
    public static void main(String[] args) {
        /*
        Soru kullanıcıdan isim ve soyismini ayrı ayrı alın
        -ismi daha uzun ise isim ve soy isim ilk harf büyük harf kalanlar kücük harf olarak yazdırın
        -soyisim daha uzun ise isim ilk harf buyuk diğerleri kücük yazdırın, soyismi buyuk harflerle yazdırın
        */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen isminizi yazın :");
        String isim = scanner.next();
        System.out.println("lütfen soyisminizi yazın :");
        String soyisim = scanner.next();


        if (isim.length()>soyisim.length()){
            System.out.println(isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase() +" "
                                + soyisim.toUpperCase().charAt(0)+soyisim.substring(1).toLowerCase());
        } else {
            System.out.println(isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase()
                    +" "+soyisim.toUpperCase());
        }




    }
}
