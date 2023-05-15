package day27_pollymorphism_abstractClasslar;

public class C04_Toyota extends C03_Araba{
    @Override
    void teker() {
        System.out.println("toyota araclarda pirelli teker kullanır");
    }

    @Override
    void motor() {
        System.out.println("toyota araclar cevreci motor kullanır");
    }

    @Override
    void gosterge() {
        System.out.println(" gosterge digital");
    }

    public static void main(String[] args) {
        /*
        Satısa cıkan tum araclar icin somut degerler atanmalı
        child classlar parenttaki tum methodları override etmek zorunda olsun
        normal parent child ilişkisinde mecburiyet yoktur.

        Abstraction un temel amacı child classların mutlaka kendisine uyarlaması gereken methodları
        override etmektir

        bir class abstract yapılıp icerisine abstract methodlar konursa o classı parent edinen tum child
        claslar parent classtaki  abstract methodları override etmelidir.
        aksi durumda cte olusur.
         */

        C04_Toyota arac1 =new C04_Toyota();
        arac1.teker();//Tum arabaalrın tekeri olmalı
        arac1.klima();
        arac1.motor();//Tum arabaalrın motoru olmalı

    }
}
