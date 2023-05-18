package day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_DatayaErisim {
    public static void main(String[] args) {
        //numarası verilen ogrencinin isim ve soyisminin
        // ilk harfleri buyuk sonraki harfleri kucuk olarak yazdırın

        Map<Integer, String> ogrenciMap =new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Can-10-K-MF");
        System.out.println(ogrenciMap);//{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Can-10-K-MF}
        System.out.println(ogrenciMap.get(101));//Ali-Can-11-H-MF

        System.out.println(MapMethodlar.numaraIleOgrenciBulma(ogrenciMap, 102));

    }


}
