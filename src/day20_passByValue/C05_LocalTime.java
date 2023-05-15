package day20_passByValue;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class C05_LocalTime {
    public static void main(String[] args) {

        /*
        java da tarih ve saat ile ilgili bir cok class vardir.
        biz 3 class gorecegiz
        LocalTime classi saat ile ilgili methodlar icerir
         */
        LocalTime saatBaslangic = LocalTime.now();

        /*
        LocalTime.now() bulundugu satir calistiginda pc nin saatini alip kaydeder
         */
        System.out.println(saatBaslangic);

        int toplam = 0;
        for (int i = 0; i <= 50000; i++) {
            toplam += i;
        }
        System.out.println(toplam);
        LocalTime saatBitis = LocalTime.now();
        System.out.println(saatBitis);


        LocalTime saat =LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(saat);

        LocalTime saat2 =LocalTime.of(12,25,45);
        System.out.println(saat2);

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);

    }
}
