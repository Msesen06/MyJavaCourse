package day12_doWhile_scope;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
            Kullanicidan sayı degerleri alip toplayalim
            kullanici 0'a bastiginda islem bitsin
            sonucu toplasin

            While loop'ta kullanacagimiz variable'lara bastan deger atamamiz gerekir.
            eger yanlis deger atamasi yaparsak while body'si hic calismayabilir.
            Java bu dezavantajı ortadan kaldirmak icin
            do while loop olusturmustur.
            do while ilk kontrolu yapmadan calistiriyor sonra sarta bakip devam ediyor.

        */

        Scanner scanner =new Scanner(System.in);
        int sayi =0;
        int toplam=0;
        System.out.println("lütfen toplanmak uzere sayilar girin\nbitirmek icin 0'a basin");
        sayi=scanner.nextInt();
        toplam+=sayi;
        while (sayi!=0){
            System.out.println("lütfen toplanmak uzere sayilar girin\nbitirmek icin 0'a basin");
            sayi=scanner.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);
    }
}
