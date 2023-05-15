package day07_SwitchCase_StringMani;

import java.util.Locale;

public class C03_toUpperCase_toLowerCase {
    public static void main(String[] args) {
        String str ="Java Candir";
        System.out.println(str.toUpperCase());

        // metni türkçe karaktere dikkat ederek yazdırın
        str =str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str);

        String str2 ="Kimse beni aramıyor";
        System.out.println(str2.toUpperCase(Locale.forLanguageTag("Tr")));

        System.out.println(str2.charAt(4));

    }
}
