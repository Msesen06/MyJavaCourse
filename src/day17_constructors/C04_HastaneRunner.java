package day17_constructors;

public class C04_HastaneRunner {
    public static void main(String[] args) {

        /*
        biz bir obje olusturdugumuzda java once constructorun
        varligini teyit eder. varsa istenen objeyi olusturur

        olusturunca instance olan tum varaiblelarin bir kopyasini
        olusturur ve objeyle ilişkendirir
        yeni atama yapilmadigi surece classtaki degeri kullanir

        static degerler tum objeler icin gecerlidir.
        degistirilirse hepsi icin gecerli olur.

         */

       C03_Hastane per1 =new C03_Hastane();
        System.out.println(per1.personelAdi);
        per1.personelTuru="doctor";
        System.out.println(per1.maas("Doktor"));

        C03_Hastane per2 =new C03_Hastane();
        System.out.println(per2.personelTuru);

        System.out.println(per1.hastaneAdi);
        per1.hastaneAdi="Java Hastanesi";
        System.out.println(per1.hastaneAdi);

    }

}
