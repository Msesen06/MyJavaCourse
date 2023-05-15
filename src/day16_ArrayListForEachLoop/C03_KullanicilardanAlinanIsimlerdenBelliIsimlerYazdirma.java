package day16_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_KullanicilardanAlinanIsimlerdenBelliIsimlerYazdirma {
    public static void main(String[] args) {
        //Kullanicidan alinan isimlerden olusturulan listeden
        // 3 harfli ve daha fazla yazdiran bir method olusturun
        List<String> isimler = C02_KullaniciListeOlusturma.ListeOlustur();
        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).length()>=3){
                System.out.println(isimler.get(i));
            }
        }


    }

}
