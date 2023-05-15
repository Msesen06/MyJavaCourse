package day12_doWhile_scope;

public class C07_Hastane {
    static String hasteneIsmi="Yildiz Hastanesi";
    static int personelSayisi;
    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;

    /*
    eger class levelda olusturulan variable tum nesneler icin ortak ise static
    eger her bir object icin ozel ise instance olarak olusturulur.

    bu hastanede 500 tane personel varsa her birisi icin isim telefon ve adres bilgisi olmasi gerekir.

    bu classtan bir object olusturuldugunda java instance variable'larin bir
     kopyasini bu object ile ilintilendirir

    tum class level variable'lar icin deger atama zorunlulugu yoktur.
    ancak atama yapilmazsa java default atama yapar

    sayisal icin: 0
    boolean icin: false
    char icin: hiclik
    String non-primitive icin:null
     */

    public static void main(String[] args) {
        C07_Hastane ayseHemsire =new C07_Hastane();
        ayseHemsire.personelIsmi="ahmet";
        ayseHemsire.personelAdresi="cankaya";
        System.out.println(personelSayisi);
        C07_Hastane ahmetHemsir =new C07_Hastane();
        ahmetHemsir.personelIsmi="ahmet";
        ahmetHemsir.personelTelefonu="5656564434";
        System.out.println(ahmetHemsir.personelIsmi);

        // static variable'lara direkt veya object uzerinden ulasiabilir
       // ancak intelliJ uyarir
        System.out.println(ayseHemsire.hasteneIsmi);
        ayseHemsire.hasteneIsmi="Levent";// herkes icin degisir
        System.out.println(ahmetHemsir.hasteneIsmi);


    }
}
