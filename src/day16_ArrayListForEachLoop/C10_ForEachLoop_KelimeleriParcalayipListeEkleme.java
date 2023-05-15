package day16_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C10_ForEachLoop_KelimeleriParcalayipListeEkleme {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
                - Kelimenin uzunlugu cift sayi ise ilk yarisini
                - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                yeni bir listeye ekleyip yazdirin
         */

        String[] isimler ={"Ahmet","Mehmet","Ayse","Sena","Doruk","Sevgi","Kubra"};
        kelimeleriParcalayipListeEkleme(isimler);




    }
    public static void kelimeleriParcalayipListeEkleme(String[] isimler){
        List<String> isimlerList =new ArrayList<>();

        for (String each:isimler
        ) {
            if (each.length()%2==0){
                isimlerList.add(each.substring(0,each.length()/2));
            }
            else {
                isimlerList.add(each.substring((each.length()-1)/2));
            }

        }
        System.out.println(isimlerList);

    }
}
