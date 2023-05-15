package day10_NestedForLoop_MethodOlusturma;

public class C10_AsalSonucuYazdirma {
    public static void main(String[] args) {
        AsalSayiHesapla(54);

    }
    public static void AsalSayiHesapla(int sayi){
        boolean asalMi=true;
        if (sayi<2) {
            System.out.println("sayı 2'den buyuk olmalı");
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi%i==0){
                    asalMi =false;
                    break;
                }
            }
            if (asalMi){
                System.out.println(sayi+" sayısı asaldır");
            } else {
                System.out.println(sayi+" sayısı asal degildir");
            }


        }

    }
}
