package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C03_UpdateEntry {
    public static void main(String[] args) {
        //ogrenci mapinde yılsonu sınıf artırın
        //


        Map<Integer, String> ogrenciMap= MapMethodlar.ogrenciMapOlustur();
        ogrenciMap.put(106,"Orhan-veli-12-H-MF");
        ogrenciMap.put(107,"Ahmet-demir-Mezun-H-MF");
        System.out.println(ogrenciMap);
        ogrenciMap =MapMethodlar.yilsonuSinifArttir(ogrenciMap);
        System.out.println(ogrenciMap);

    }
}
