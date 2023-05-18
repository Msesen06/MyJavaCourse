package day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapMethodlar {
    //bu methodda static methodlar olusturalım. heryerden ulasabilelim


    public static  String numaraIleOgrenciBulma(Map map, int numara){

        String valueBilgiler = (String) map.get(numara);

        String[] valueArray =valueBilgiler.split("-");
        String ad =valueArray[0];
        String soyad =valueArray[1];

        ad =ad.toUpperCase().charAt(0)+ad.substring(1).toLowerCase();
        soyad =soyad.toUpperCase().charAt(0)+soyad.substring(1).toLowerCase();
        String uygunFormat = ad+" "+soyad;

        return uygunFormat;


    }

    public static Map<Integer, String> ogrenciMapOlustur(){
        Map<Integer, String> ogrenciMap =new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(105,"Sevda-Cem-12-H-TM");


        return ogrenciMap;
    }
}

