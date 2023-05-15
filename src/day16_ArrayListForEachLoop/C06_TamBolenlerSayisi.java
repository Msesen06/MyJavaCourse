package day16_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_TamBolenlerSayisi {
    public static void main(String[] args) {
        // girilen bir pozitif sayinin tam bolenlerini
        // bir liste olarak donduren donduren bir method olusturun

        List<Integer> tamBolenListesi =TamBolenSayisi(100000);

        System.out.println("girdiginiz pozitif sayının tam bolenleri sunlardir :"+tamBolenListesi);
    }

    public static List<Integer> TamBolenSayisi(Integer girilen){

        List<Integer> tamBolenListesi =new ArrayList<>();
        for (int i = 1; i <= girilen; i++) {
            if (girilen%i==0){
                tamBolenListesi.add(i);
            }
        }

        return tamBolenListesi;
    }
}
