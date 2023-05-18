package day32_Maps;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Keys {
    public static void main(String[] args) {
        //her classta map ile islem yapabilmek icin bir map olusturmak ve ogrencileri eklemek zorundayız.

        //Map methodlar clasında bir map olusturup ogrencileri ekleyip bize donduren bir method olusturalım

        Map<Integer, String> ogrenciMap =MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);//[101, 102, 103, 104, 105]

        //mapdeki tum keyleri yazdırın
        System.out.println(ogrenciMap.keySet());

        Set<Integer> keySeti =ogrenciMap.keySet();
        //keysetindeki  ogrenci numaralarını asagıdaki  formatta yazdırın
        //1-101
        //2-102
        //3-103

        int siraNo =1;
        for (Integer eachKey:keySeti
             ) {
            System.out.println(siraNo+"- "+eachKey);
            siraNo++;
        }
        //tum ogrencilerin isim ve soyisimlerini bir liste olarak yazdıran bir method olusurturun

    }
}
