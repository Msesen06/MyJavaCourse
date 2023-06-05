package Practice.kutuphane;

import java.util.*;

public class Runner {


    public static void main(String[] args) {
        Kutuphane kutuphane =new Kutuphane();
        Kitap kitap1 =new Kitap("Kürk Mantolu Madonna","Sabahattin Ali");
        Kitap kitap2 =new Kitap("Suc ve Ceza","Dostoyevski");
        Kitap kitap3 =new Kitap("Mavi ve Siyah","H.Ziya Usakligil");
        Kitap kitap4 =new Kitap("Kırmızı ve Siyah","Stendhal");
        Kitap kitap5 =new Kitap("Yalnızız","Peyami Safa");
        Kitap kitap6 =new Kitap("Tutunamayanlar","Oğuz Atay");
        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);
        kutuphane.kitapEkle(kitap3);
        kutuphane.kitapEkle(kitap4);
        kutuphane.kitapEkle(kitap5);
        kutuphane.kitapCikar(kitap6);

        //burada kitaplar map'e eklendi
        Map<Integer,String> okunacakKitaplar =new HashMap<>();
        int key =1;
        for (Kitap kitap: kutuphane.getKitaplar()
             ) {
            okunacakKitaplar.put(key,kitap.getKitapAdi()+"-"+kitap.getYazar());
            key++;
        }
        System.out.println("kitaplar :"+okunacakKitaplar);

        for (Integer each: okunacakKitaplar.keySet()
             ) {
            String value = okunacakKitaplar.get(each);
            String [] array =value.split("-");
            System.out.println(each +"- Kitap adı :"+array[0] +" Kitap yazarı: "+array[1]);
        }
        System.out.println(okunacakKitaplar);

        int deger = (int) (Math.random()*okunacakKitaplar.size()+1);
        System.out.println(deger);
        String secilenKitap = okunacakKitaplar.get(deger);

        System.out.println(deger+". kitap :"+secilenKitap);
    }

}

