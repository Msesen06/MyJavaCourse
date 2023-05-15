package day16_ArrayListForEachLoop;

import java.util.List;
import java.util.Scanner;

public class C14_ForEachLoop_Soru {
    public static void main(String[] args) {
        /*

        Stringlerden olusan bir list icindeki kelimelerden  a harfi olanlari yazdirin

        */
        List<String> isimler = C02_KullaniciListeOlusturma.ListeOlustur();
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen aradıgınız harfi girin");
        String harf = scanner.next();
        for (String isim:isimler
             ) {
            if (isim.contains(harf)){
                System.out.println(isim);
            }
        }
    }
}
