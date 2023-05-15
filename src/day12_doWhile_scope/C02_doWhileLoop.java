package day12_doWhile_scope;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        /*Kullanicidan sayı degerleri alip toplayalim
        kullanici 0'a bastiginda islem bitsin
        sonucu toplasin */

        /*
        do while loop kontrol etmeden once bir defa calisir.
        while loopta loop body sinin calismama ihtimali vardir.
        do while loopta yoktur.

         */
        Scanner scanner =new Scanner(System.in);
        int sayi=0;
        int toplam=0;
          do {
              System.out.println("lütfen toplanmak uzere sayilar girin\nbitirmek icin 0'a basin");
              sayi=scanner.nextInt();
              toplam+=sayi;


          } while (sayi!=0);
        System.out.println("girdiginiz sayilarin toplami = "+toplam);

    }
}
