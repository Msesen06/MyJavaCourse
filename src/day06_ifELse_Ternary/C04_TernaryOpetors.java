package day06_ifELse_Ternary;

public class C04_TernaryOpetors {
    public static void main(String[] args) {
        /*
        ternary operatorleri basit if cümleleri için kullanılır
         ? isareti ve :

         farklı data türlerinde ise atama yapamayız sadece yazdırabiliriz
         */
        int sayi=14 ;
        System.out.println(sayi % 2 == 0 ? "sayı cifttir" : "sayı cift degildir");
         // soru verilen sayı pozitif ise 2 katını degilse 10 fazlasını bulun
        int a =10;
        a=a>0 ? 2*a :a+10;
        System.out.println(a);


    }
}
