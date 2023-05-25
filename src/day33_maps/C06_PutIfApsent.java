package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_PutIfApsent {
    public static void main(String[] args) {
        /*
        Soru : Verilen bir array’de kullanilan
        sayilari ve kacar defa kullanildigini
        yazdirin.
        Input : Input : {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"}
        output : 1 kullanimi : 3 adet
        a kullanimi : 4 adet
        b kullanimi : 2 adet
        c kullanimi : 2 adet
        d kullanimi : 1 adet
        k kullanimi : 3 adet
        z kullanimi : 1 adet

         */

        String[] harfler = {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"};

        Map<String,Integer> harfKullanimMapi =new TreeMap<>();
        //her bir harfi ele alalım harf mapte yoksa key=harf, value=1 olarak ekleyelim
        //harf mapte varsa valuesini 1 artıralım
            //1.Yontem
        for (String eachHarf: harfler
             ) {
            if (!harfKullanimMapi.containsKey(eachHarf)){
                harfKullanimMapi.put(eachHarf,1);
            } else {
                int mevcutKullanimSayisi =harfKullanimMapi.get(eachHarf);
                harfKullanimMapi.put(eachHarf,mevcutKullanimSayisi+1);
            }
        }
        System.out.println(harfKullanimMapi);
        //2.yontem
        Map<String,Integer> harfKullanimMapi2 =new TreeMap<>();
        for (String eachHarf: harfler
             ) {
            if (harfKullanimMapi2.putIfAbsent(eachHarf,1)!=null){
                int mevcutKullanimSayisi =harfKullanimMapi.get(eachHarf);
                harfKullanimMapi.put(eachHarf,mevcutKullanimSayisi+1);
            }
        }
        System.out.println(harfKullanimMapi2);

    }
}
