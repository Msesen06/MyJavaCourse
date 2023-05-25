package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C02_EntrySet {
    public static void main(String[] args) {
        /*
        java key ve value ları birlikte barındırması icin Enrty isimli bir class olusturmustur.
        entry uzerinde yapılan update ler otomotik olarak map islenir.
         */

        //ogrenci listesini numara-isim-soy isim-sınıf seklinde yazdırın

        Map<Integer,String> ogrenciMap =MapMethodlar.ogrenciMapOlustur();

        MapMethodlar.numaraliTumOgrencileriYazdir(ogrenciMap);
    }
}
