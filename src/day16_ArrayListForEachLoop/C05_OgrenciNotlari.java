package day16_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_OgrenciNotlari {
    public static void main(String[] args) {
        //ogretmenden alinan ogrenci notlarinin ortalamasini ve kac ogrencinin ortalamanin ustunde
        // kacinin altinda aldigini donduren bir method olusturun

        List<Integer> notlarListesi =C04_KullanicidanIntListOlusturma.IntListOlustur();
        System.out.println(notlarListesi);
        ortalamaUstundeOgreniSayisi(notlarListesi);

    }

    public static void ortalamaUstundeOgreniSayisi(List<Integer> notlarListesi){

        int ortalama =0;
        int sayac =0;
        int toplam=0;


        for (int i = 0; i < notlarListesi.size(); i++) {
            toplam+=notlarListesi.get(i);

        }
        ortalama=toplam/ notlarListesi.size();

        for (int i = 0; i < notlarListesi.size(); i++) {
            if (ortalama> notlarListesi.get(i)){
                sayac++;
            }
        }
        System.out.println("ogrenci sayisi :"+notlarListesi.size());
        System.out.println("Not ortalamasi :"+ortalama);
        System.out.println("basarili ogrenci sayisi :"+sayac);
    }
}
