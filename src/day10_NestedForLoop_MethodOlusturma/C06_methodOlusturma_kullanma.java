package day10_NestedForLoop_MethodOlusturma;

import java.util.Locale;

public class C06_methodOlusturma_kullanma {
    public static void main(String[] args) {
        /*
        iki tur method vardir .sonuc donduren ve sonuc dondurmeyen
        sonuc dondurmeyen methodlarin return type'i  void'dir



       */
        String str="java'nin robotlari";
        /*
        eger bir method bize bir sonuc döndürüyorsa methodu calistirmak
        sonucu gormek icin yeterli degildir.
        sout icerisinde yazmak gerekir ya da donen bilgiyi bir variable a atama yapar
        istedigimiz zaman kullaniriz..


        */
        str.toUpperCase();
        str =str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
    }
}
