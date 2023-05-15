package day21_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat =LocalTime.now();
        //calistigi anda sistemde var olan zamani saat variable ına atar
        // kronometre gibi calismaz sadece o satirin calistigi zamani kaydeder
        // eger farkli satirlarin calisma zamanlarini gormek istersek o satirlarda yeni localtime
        //objeleri olusturmaliyiz.

        System.out.println("saat == "+saat.getHour()+":"+saat.getMinute());
        //saat.get() saatin istedigimiz bolumunu getirir
        System.out.println(saat.withHour(15));
        // istedigimiz bolumun yeni bir degerle degistirerek getirir.

        System.out.println(saat.plusHours(20));// 20 saat sonra
        System.out.println(saat.minusHours(35));// 35 saat once


        LocalTime istenenZaman =LocalTime.of(12,15,23,10);
        System.out.println(istenenZaman);

        System.out.println(istenenZaman.isAfter(saat));//true
        System.out.println(istenenZaman.isBefore(saat));// false

        System.out.println(istenenZaman.compareTo(saat));//1


    }
}
