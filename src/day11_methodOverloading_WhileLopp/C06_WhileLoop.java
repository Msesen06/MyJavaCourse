package day11_methodOverloading_WhileLopp;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
          /* Soru:
               Kullanıcıdan toplanmak uzere sayılar alin toplam 500 veya asarsa sayı almayı durdurup
               toplamın kac oldugunu ve kac sayi girildiğiniyazdırın

          */
        Scanner scanner =new Scanner(System.in);
         int toplam =0;
         int sayi  =0;
         int sayac=0;

         while (toplam<500){
             System.out.println("lütfen sayi girin");
             sayi = scanner.nextInt();
             toplam+=sayi;
             sayac++;
         }
        System.out.println("kac kez :"+sayac+ "\ntoplam: "+toplam);
    }
}
