package day17_constructors;

public class C08_HastaneRunner {


    public static void main(String[] args) {
        C07_Hastane per1 =new C07_Hastane();
        System.out.println("Personel Adı :"+per1.personelAdi+", Personel Adresi :"+per1.personelAdres+
                ", personel Tel :"+per1.personelTel+", personel Turu :"+per1.personelTuru);

        System.out.println(per1);

        C07_Hastane per2 =new C07_Hastane("Serhat");
        System.out.println(per2);

    }
}
