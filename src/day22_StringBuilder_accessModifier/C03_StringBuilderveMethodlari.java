package day22_StringBuilder_accessModifier;

import java.util.Locale;

public class C03_StringBuilderveMethodlari {
    public static void main(String[] args) {
        StringBuilder sb1 =new StringBuilder("Java candir.");
        System.out.println(sb1.substring(5));

        String str ="Java candir.";
        System.out.println(sb1);
        System.out.println(str.substring(5));

        //Sb de bazı methodlar string dondugu icin string immutablety ye uyarlar. ve degismez
        // bazen sb de olmayan ancak string de olan bazı methodlari kullanabiliriz.
        // bu durumda sb yi  stringe donusturmek gerekir.

        System.out.println(sb1.toString().toUpperCase(Locale.forLanguageTag("Turkey")));//JAVA CANDIR.

        sb1 =new StringBuilder(sb1.toString().toUpperCase());
        System.out.println(sb1);

        /*
        eger string kullanarak bir sb yi kalıcı olarak degistirmek istersek
            -once toString() yapıp stringe ceviririz.
            -string haliyle string manipulation yapabiliriz.
            -string olan yeni degeri Sbye atariz.
            sb =new stringbuilder(str)
          */

    }
}
