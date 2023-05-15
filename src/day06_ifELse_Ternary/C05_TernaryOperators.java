package day06_ifELse_Ternary;

import java.util.Scanner;

public class C05_TernaryOperators {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı alın
        // sayı pozitifse cift veya tek olduğunu yazın
        // negatifse 3 basamaklı ve degil yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayi= scanner.nextInt();

        System.out.println(sayi>0
                            ?
                            sayi%2==0 ? "sayı cift" : "sayı tek"
                            :
                            -100>=sayi && sayi>=-999 ? "sayı 3 basamaklı ": " sayı 3 basmaklı değil"
                            );

        //soru kullanıcıdan notunu 50 den buyukse gectin degilse kaldın yazdırın
        System.out.println("notunu gir :");
        int not = scanner.nextInt();
        System.out.println(not >50 ? "Gectiniz" : "Kaldınız");

        // soru kullanıcıdan bir sayı alın mutlak degerini yazdırın

        System.out.println("bir sayı daha bir zahmet");
        int sayi1= scanner.nextInt();
        System.out.println(sayi1>0 ? sayi : sayi1*-1);
        System.out.println(Math.abs(sayi1));
    }




}
