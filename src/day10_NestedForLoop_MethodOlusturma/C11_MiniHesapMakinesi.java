package day10_NestedForLoop_MethodOlusturma;

public class C11_MiniHesapMakinesi {
    public static void main(String[] args) {
        /*
        Soru :kullaninin verdigi iki sayıya ve sectigi isleme gore bize sonucu
        donduren bir method olusturun
         */

        HesapMakinesi(12,3,'*');
        //bize sonuc donduren methodları ya direkt yazdırabiliriz
        // yada bir variable ataybiliriz.
        double carpma =HesapMakinesi(5,6,'*');
        System.out.println(carpma);
        System.out.println(HesapMakinesi(12,4,'+'));
        System.out.println(HesapMakinesi(12,2,'/'));
        System.out.println(HesapMakinesi(5,2.5,'-'));
    }

    public static double HesapMakinesi(int sayi, double sayi2, char islemSembolu) {
        double sonuc = 0;
        switch (islemSembolu) {
            case '+':
                sonuc = sayi + sayi2;
                break;
            case '-':
                sonuc = sayi - sayi2;
                break;
            case '*':
                sonuc = sayi * sayi2;
                break;
            case '/':
                sonuc = sayi / sayi2;
                break;
            default:
                System.out.println("yanlış sembol girdiniz");
        }
        return sonuc;
    }

}
