package day11_methodOverloading_WhileLopp;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        /*
        Java overloading yapilmis methodlardan hangisinin calisacagina karar verirken
        adim adim ilerler
        1- eger argument ve parametre yuzde 100 uyumluysa onu calistirir
        2-eger argument ve parametre tamamen uyumlu degilse java casting yapilabilir mi diye akar
        ancak en az casting yapacagi methodu calistirir.
         */
        topla(3,5);
        topla('a','b');
        topla(3.2f,4.5f);
    }
    public static void topla(double sayi1, double sayi2){
        System.out.println(" iki double'in toplami : " + (sayi1+sayi2));
    }
    public static void topla(int sayi1, float sayi2){
        System.out.println(" int ve floatın toplamı : " + (sayi1+sayi2));
    }

    public static void topla(int sayi1, int sayi2){
        System.out.println(" iki int'in toplami : " + (sayi1+sayi2));
    }
}
