package day32_Maps;

import java.util.*;

public class C01_MapOlusturma {
    public static void main(String[] args) {
        //coklu element barındıran collections olusturma

        List<String> liste =new ArrayList<>();
        liste.add("5");
        Set<Integer> sayiSeti =new HashSet<>();
        sayiSeti.add(5);

        //Map  her zaman key-value ikilisi barındırır
        // bu ozelligi  sebebiyle map olustururken key-value yazılmalıdır.

        Map<Integer, String> ogrenciMap =new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Can-10-K-MF");
        System.out.println(ogrenciMap);//{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Can-10-K-MF}
        System.out.println(ogrenciMap.get(101));//Ali-Can-11-H-MF


        //103 nolu ogrencinin subesini  getirelim.
        //mapte tum bilgiler String olarak birlestirilen value icindedir
        //string icerisindeki  bilgilere erisemeyiz.
        // once istenen ogrencinin valuesini getirilir. get methodu ile
        //value ozel isaretlerle ayrılmıstır. split ile bu bilgiler arraya aktarılıp kaydedilir.
        String value103 =ogrenciMap.get(103);
        System.out.println(value103);//Ali-Cem-11-K-TM
        String[] valueArray=value103.split("-");
        System.out.println(Arrays.toString(valueArray));//[Ali, Cem, 11, K, TM]

        //istenen indexe gidilir.
        System.out.println(valueArray[3]);//K



    }
}
