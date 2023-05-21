package Practice.kutuphane;

import java.util.*;

public class Runner {


    public static void main(String[] args) {
        Kutuphane kutuphane =new Kutuphane();
        Kitap kitap1 =new Kitap("Kürk Mantolu Madonna","Sabattin Ali");
        Kitap kitap2 =new Kitap("Suc ve Ceza","Dostoyevski");
        Kitap kitap3 =new Kitap("Mavi ve Siyah","H.Ziya Usakligil");
        Kitap kitap4 =new Kitap("Kırmızı ve Siyah","Stendhal");
        Kitap kitap5 =new Kitap("Yalnızız","Peyami Safa");
        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);
        kutuphane.kitapEkle(kitap3);
        kutuphane.kitapEkle(kitap4);
        kutuphane.kitapEkle(kitap5);


        //burada kitaplar map'e eklendi
        Map<Integer,String> okunacakKitaplar =new HashMap<>();
        int sayac =1;
        for (Kitap kitap: kutuphane.getKitaplar()
             ) {
            okunacakKitaplar.put(sayac,kitap.getKitapAdi()+"-"+kitap.getYazar());
            sayac++;
        }
        System.out.println(okunacakKitaplar);

        String secilenKitap = okunacakKitaplar.get( (int) (Math.random()* okunacakKitaplar.size()));
        System.out.println(secilenKitap);
    }

}

