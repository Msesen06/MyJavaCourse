package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C05_MapsMethodlari {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        ogrenciMap.put(110,"Sevda-Fan-12-H-Tm");// yeni eleman ekler eger o key varsa eskisini siler aynsını ekler.
        ogrenciMap.put(101,"Sevda-Run-12-H-MF");//valueyi degistirir
        System.out.println(ogrenciMap);

        ogrenciMap.replace(102,"Sevde-Dun-11-H-SOZ");
        System.out.println(ogrenciMap);//put ile aynı

        ogrenciMap.replace(103,"Ali-Cem-11-K-TM","Kubra-Can-11-K-TM");
        ogrenciMap.replace(104,"Ayse-Can-10-H-MF","Ayse-Cer-10-H-MF");
        System.out.println(ogrenciMap);// o value boyleyse degistir degilse degistirme


        System.out.println(ogrenciMap.getOrDefault(105, "bu ogrenci mapte yok"));
        //varsa getirir yoksa bir mesaj yazdırır (get ten farkı)
        System.out.println(ogrenciMap.getOrDefault(120, "bu ogrenci mapte yok"));
        System.out.println("get methodu :"+ogrenciMap.get(120));

        System.out.println(ogrenciMap.containsKey(105));//true key varsa yoksa false;
        System.out.println(ogrenciMap.containsValue("Sevda-Fan-12-H-Tm")); //o value varsa true

        ogrenciMap.putIfAbsent(120,"Sevdali-Bun-12-H-Dil");
        ogrenciMap.putIfAbsent(102,"Ahmet-Can-12-H-Dil");
        System.out.println("ogrenci map son hali :"+ogrenciMap);

    }
}
