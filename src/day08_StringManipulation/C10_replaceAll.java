package day08_StringManipulation;

public class C10_replaceAll {
    public static void main(String[] args) {

        // str icindeki butun rakamları ve diger karakterleri temizleyin
        String str ="J349/&%&%+6%&%5554^'^+%&/(a766v4343//&a/&";
       str=str.replaceAll("\\d", "");// rakamları at
       str=str.replaceAll("\\W","");// harf veya rakam olmayan herseyi at
        System.out.println(str);



    }
}
