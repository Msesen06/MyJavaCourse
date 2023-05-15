package day20_passByValue;

public class C04_StringPool {
    public static void main(String[] args) {
        String str1 ="Java";
        String str2 ="Java";
        String str3 =new String("Java");
        String str4 ="Ja"+"va";
        String s ="Ja";
        String t ="va";
        String str5 =s+t;
        String str6 =s.concat(t);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str1.equals(str6)); // hepsi true

        System.out.println("================================");
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str6);//false


        /*
        eqauls() methodu sadece metin degerlerine bakar

        == ise referanslarina ve metin degerlerine bakar
         */


    }
}
