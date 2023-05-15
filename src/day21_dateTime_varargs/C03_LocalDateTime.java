package day21_dateTime_varargs;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {


        LocalDateTime ts =LocalDateTime.now();
        System.out.println(ts);//2023-05-03 T 12:23:53.386144200

        System.out.println(ts.getDayOfMonth() + "/" + ts.getMonthValue() + "/" + ts.getYear() + " " + ts.getHour() + ":" + ts.getMinute());
    }
}
