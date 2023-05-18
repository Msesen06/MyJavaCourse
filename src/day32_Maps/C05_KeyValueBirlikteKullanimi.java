package day32_Maps;

import java.util.Map;

public class C05_KeyValueBirlikteKullanimi {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap =MapMethodlar.ogrenciMapOlustur();
        //ogrenci numarası verilen iki deger arasında olan sınırlar dahil tum ogrencilerin
        //numara isim ve soyisim ve bolumlerini yazdirin

        int basNo =101;
        int bitNo =104;
        MapMethodlar.numaraAraligindakiOgrencileriYazdir(ogrenciMap,basNo,bitNo);

    }
}
