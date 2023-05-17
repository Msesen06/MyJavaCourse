package Practice;

import java.util.ArrayList;
import java.util.List;

public class Q1_dizi {
    public static void main(String[] args) {
        //kullanıcıdan bir tamsayı dizisi isteyin
        //dizideki tum tekrar eden elemanları bulup
        //her bir elemanın kac kez tekrar ettigini ve dizideki ilk gorunum indisini
        // ve son gorunum indislerini ekrana yazdırın.

        int[] sayilar = {1, 1, 3, 4, 3, 5, 4, 6, 7, 8, 5, 5, 7, 1};
        List<Integer> tekrarEden = new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            int deger = sayilar[i];
            int sayac = 0;
            if (tekrarEden.contains(sayilar[i])) {
                continue;
            }
            List<Integer> indis = new ArrayList<>();
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] == sayilar[j]) {
                    sayac++;
                    indis.add(j);
                    tekrarEden.add(sayilar[j]);
                }
            }
            if (sayac != 0) {
                System.out.println("\ntekrar eden sayı :" + deger +
                        "\t tekrar sayısı :" + sayac + "\tilk gorundugu indis :" + i + "\ndiger bulundugu indisler :" + indis);
            }
        }
    }
}
