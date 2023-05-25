package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C01_tekrar {
    public static void main(String[] args) {
        Map<Integer ,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        MapMethodlar.tumOgrencileriYazdir(ogrenciMap);

        MapMethodlar.numaraileUpdateEt(ogrenciMap,103,"cancan");
        System.out.println(ogrenciMap);
        /*
        java key ve value ları birlikte barındırması icin Enrty isimli bir class olusturmustur.
        entry uzerinde yapılan update ler otomotik olarak map islenir.
         */
    }
}
