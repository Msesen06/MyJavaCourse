package day21_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C05_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi =LocalDate.of(1994,5,1);
        LocalDate bugun =LocalDate.now();
        Period yasim =Period.between(dogumTarihi,bugun);
        System.out.println(yasim); //P 29Y 2D
        System.out.println(yasim.getYears());//29

    }
}
