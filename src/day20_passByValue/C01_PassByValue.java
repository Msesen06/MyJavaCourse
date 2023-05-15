package day20_passByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        int sayi=20;

        sayi=method2(sayi);

        System.out.println("method2 call sonrasi sayi :"+sayi);

        System.out.println("method call sonucu sayi :"+method1(sayi));
        System.out.println("method call sonrasi sayi :"+sayi);

    }

    public static int method1(int sayi){
        sayi =25;
        System.out.println("method1 icinde sayi :"+sayi);
        return sayi;
    }
    public static int method2(int sayi){
        sayi =25;
        System.out.println("method2 icinde sayi :"+sayi);
        return sayi;
    }
}
