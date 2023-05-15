package day08_StringManipulation;

public class C06_LastIndexOf {
    public static void main(String[] args) {
        String str="Java cok faydali cok";
        System.out.println(str.lastIndexOf("a"));//13 sondan başlar ilkini verir
        System.out.println(str.lastIndexOf("a", 10));// 10 dahil
        System.out.println(str.lastIndexOf("a", 9));//3
        System.out.println(str.lastIndexOf("a", 2));
        System.out.println(str.lastIndexOf("cok", str.length()-1));
        System.out.println(str.indexOf("kal"));
        /*
        Soru
        verilen bir cümlede istenen bir string için
        1-istene kelime cümlede 1 kere kullanılmıs
        2-istenen kelime cümlede 1 den fazla kullanılmıs
        3-istenen kelime cümlede hic kullanılmamıs
         */
        int bastanindex=str.indexOf("cok");
        int sondanindex=str.lastIndexOf("cok");
        if (str.indexOf("cok")==-1){
            System.out.println("aradığınız kelime cümlede yok");
        } else if (bastanindex==sondanindex) {
            System.out.println("aradığınız kelime cümle icinde bir kere kullanılmıs");
        }
         else {
                System.out.println("aradığınız kelime cümle içinde birden fazla sayıda kullanılmıs");
            }


    }
}
