package day11_methodOverloading_WhileLopp;

public class C01_methodOlustuma {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
                - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
                - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin

         */

        substringMethodu("ahmet",0,4);
    }

    public static void substringMethodu( String str,int ilkindex,int sonindex){

        if (ilkindex>sonindex) {
            System.out.println("hata : ilk index son indexten buyuk olamaz");
        } else if (sonindex>str.length()-1) {
            System.out.println("hata : index metnin sınırları dısında");

        } else {
            for (int i = ilkindex; i < sonindex; i++) {
                char karakter =str.charAt(i);
                System.out.print(karakter);
            }
        }



    }
}
