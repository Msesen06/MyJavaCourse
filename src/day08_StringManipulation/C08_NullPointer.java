package day08_StringManipulation;

public class C08_NullPointer {
    public static void main(String[] args) {

        /*
        null bir deger degildir
        non-pritimive data türlerinde deger atanmadıgını işaret eder

        ama deger ataması yapmadan yazdırmak istiyorsak null pointer kullanırız
         */
        String str =null; // hazır methodlar kullanılamaz olayan bir seyin uzunlugu vs olmaz
        String str2 ="ali";
        str2=str2.concat(" ahmet");
        System.out.println(str2);
        Integer sayi =null;// burada da kullanılmaz

    }
}
