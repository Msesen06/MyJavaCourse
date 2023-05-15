package Alistirmalar;

import java.util.Scanner;

public class Practise_11May_TopYuksekligi {
    public static void main(String[] args) {
        //Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
        // while code blogu create ediniz.
        Scanner scanner =new Scanner(System.in);
        System.out.println("lutfen top dusecegi yuksekligi girin");
        double yukseklik;
        yukseklik = scanner.nextDouble();
        System.out.println("Topun aldıgı toplam yol :"+topYuksekligi(yukseklik));
    }
    private static double topYuksekligi(double yukseklik){

        double toplamYol =0;
        int yereVurmaSayisi =0;

        do {
            toplamYol+=yukseklik;
            yereVurmaSayisi++;
            yukseklik =yukseklik*3/4;
            toplamYol+=yukseklik;
        }while (yukseklik>=1);
        System.out.println("Topun yere vurma sayısı :"+yereVurmaSayisi);
       return toplamYol;
    }
}
