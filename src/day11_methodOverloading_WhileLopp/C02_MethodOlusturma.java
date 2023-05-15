package day11_methodOverloading_WhileLopp;

import java.util.Scanner;

public class C02_MethodOlusturma {
    public static void main(String[] args) {
        /*Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
                  bolenleri sayisini bulup bize donduren bir method olusturun

         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı girin :");
        int sayi = scanner.nextInt();
        System.out.println(pozitifBolenSayisi(sayi));
        int ptbs =pozitifBolenSayisi(sayi);
        if (ptbs==2){
            System.out.println("sayı asal");
        } else {
            System.out.println("sayı asal degil.");
        }
    }
    public static int pozitifBolenSayisi(int sayi){
        int sayac =0;
        for (int i = 1; i <=sayi; i++) {
            if (sayi%i==0){
                sayac++;
            }

        }

        return sayac;
    }
}
