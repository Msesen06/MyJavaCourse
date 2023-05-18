package day32_Maps;

import java.util.Map;

public class C04_Values {
    public static void main(String[] args) {
        Map<Integer ,String> ogrenciMap =MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        /*
      {101=Ali-Can-11-H-MF,
      102=Veli-Cem-10-K-TM,
      103=Ali-Cem-11-K-TM,
      104=Ayse-Can-10-H-MF,
      105=Sevda-Cem-11-H-TM}
         */
        //tum ogrencilerin sadece valuelarını yazdırın
        System.out.println(ogrenciMap.values());
        /*
        [Ali-Can-11-H-MF,
        Veli-Cem-10-K-TM,
        Ali-Cem-11-K-TM,
        Ayse-Can-10-H-MF,
        Sevda-Cem-12-H-TM]

         */

        //istenen sınıftaki tum ogrencilerin isim ve soyisimlerini yazdırın

            MapMethodlar.istenenSiniftakiOgrencileriYazdir(ogrenciMap,10);

            //verilen soyisme sahip tum ogrencileri yazdirin
            //verilen subedeki tum ogrencileri yazdırın
            //verilen sınif ve subedeki tum ogrencileri yazdirin


    }
}
