package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C07_Compute {
    public static void main(String[] args) {
        Map<String,Integer> harfKullanimSAyilari =new TreeMap<>();
        harfKullanimSAyilari.put("A",20);
        harfKullanimSAyilari.put("K",10);
        harfKullanimSAyilari.put("C",23);
        harfKullanimSAyilari.put("Z",32);

        System.out.println(harfKullanimSAyilari);//{A=20, C=23, K=10, Z=32}

        int eskiDeger =harfKullanimSAyilari.get("A");
        harfKullanimSAyilari.put("A",2*eskiDeger);
        System.out.println(harfKullanimSAyilari);//{A=40, C=23, K=10, Z=32}

        if (harfKullanimSAyilari.containsKey("B")){
            eskiDeger=harfKullanimSAyilari.get("B");
            harfKullanimSAyilari.put("B",eskiDeger+3);
        }
        System.out.println(harfKullanimSAyilari);//{A=40, C=23, K=10, Z=32}

        /*
        java var olan ve olmayan keyler ve valueleri uzerinde islem yapmak icin ozel iki
        method gelistirmistir

        bu methodlar functional programing Lambda kullanarak calısır.

         */

        //A nın degerini 2 katına cıkar

        harfKullanimSAyilari.compute("A",(k,v)->2*v);
        System.out.println(harfKullanimSAyilari);//{A=80, C=23, K=10, Z=32}

        // B varsa 3 degerini  artırın

        harfKullanimSAyilari.computeIfPresent("B",(k,v)->v+3);
        harfKullanimSAyilari.computeIfPresent("K",(k,v)->v+3);
        System.out.println(harfKullanimSAyilari);

        //eger B yoksa degeri  5 olarak ekleyin
        harfKullanimSAyilari.putIfAbsent("B",5);
        harfKullanimSAyilari.putIfAbsent("A",5);

        System.out.println(harfKullanimSAyilari);

        // eger D yoksa 5 olarak ekleyin

        harfKullanimSAyilari.computeIfAbsent("D",v->5);
        harfKullanimSAyilari.computeIfAbsent("C",v->5);
        System.out.println(harfKullanimSAyilari);//{A=80, B=5, C=23, D=5, K=13, Z=32}
    }
}
