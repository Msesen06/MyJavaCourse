package day15_MultiDimensionalarray_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_ArrayList {
    public static void main(String[] args) {
        List<String> sinif =new ArrayList<>();
        sinif.add("saida");
        sinif.add("adem");
        sinif.add("ahmet");
        sinif.add(1,"kubra");

        System.out.println(sinif);

        //arraylistin tek dezavantajı elemanlari tek tek eklenememesi

        // verilen bir arraydeki elementleri yazdiralım
        // ancak tekrar edenleri bir defa yazdirsin
        int[] sayilar={1,3,4,2,3,6,5,4,2,3,4,7,2};
        List<Integer> tekrarsizListe=new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            if(!tekrarsizListe.contains(sayilar[i])){
                tekrarsizListe.add(sayilar[i]);
            }
        }
        System.out.println("arrayList :"+tekrarsizListe);




    }
}
