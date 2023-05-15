package day21_dateTime_varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C02_LocalDate {

    public static void main(String[] args) {
        LocalDate tarih =LocalDate.now();
        System.out.println(tarih);

        LocalDate tarih2 =LocalDate.ofYearDay(2024,200);
        System.out.println(tarih2);

        System.out.println(tarih.isAfter(tarih2));//false

        System.out.println(tarih2.isLeapYear());//true artik yil mi

        System.out.println(tarih.datesUntil(tarih2).count()); // o tarihe kadar kac gun var

        System.out.println(tarih.getDayOfWeek()); //wednesday gunu getirir.

        LocalDate dogumTarihi =LocalDate.of(1994,05,01);
        System.out.println(dogumTarihi.getDayOfWeek());//sunday
        System.out.println(tarih2.lengthOfYear());
            // kullanıcıdan  iki kisinin dogum tarihlerini yıl ay gun olarak alıp
            // hangisinin daha once dogudugunu bulan bir method olusturun.

    }

}
