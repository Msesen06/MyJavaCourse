package day17_constructors;

public class C06_HastaneRunner {
    public static void main(String[] args) {
        C05_Hastane per1 =new C05_Hastane(); //parametresiz constructor calisti.
        System.out.println(per1.personelAdi);//İsim belirtilmedi
        System.out.println(per1.personelTel);//Telefon belirtilmedi
        System.out.println(per1.personelTuru);//Personel Turu belirtilmedi
        System.out.println(per1.maas());//1900

    }
}
