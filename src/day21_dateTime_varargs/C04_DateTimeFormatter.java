package day21_dateTime_varargs;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm ");
        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("d.M.yy hh:mm a");
        LocalDateTime ts =LocalDateTime.now();
        System.out.println(ts);
        System.out.println(ts.format(dtf1));
        System.out.println(ts.format(dtf2));

    }
}
