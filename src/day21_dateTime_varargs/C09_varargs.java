package day21_dateTime_varargs;

public class C09_varargs {
    public static void main(String[] args) {
        islemYap(2,4);//2
        islemYap(5);//0
        islemYap(4,6,7,9,11);//16
    }

    public static void islemYap(int x, int...y) {
        System.out.println(x*y.length);
    }
}
