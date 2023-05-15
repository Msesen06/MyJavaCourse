package day17_constructors;

public class C05_Hastane {

    /*
    bir classta gorunurde bir constructor yoksa
    default constructor vardir. parametresizdir. body sinde hicbir kod bulunmaz.

    default constructor asagidaki constructora benzer

     C05_Hastane() {

    }

    ancak constructor gorunuyorsa artik default olmaz .parametresiz contructor denir
    biz herhangi  bir constructor olusturursak java defaultu siler.

     */

    C05_Hastane() {
        System.out.println("parametresiz constructor calisti.");
    }
    static String hastaneAdi="Yildiz Hastanesi";
    static String getHastaneTel ="05433543212223";
    String personelAdi="İsim belirtilmedi";
    String personelAdres ="adres belirtilmedi";
    String personelTel ="Telefon belirtilmedi";
    String personelTuru ="Personel Turu belirtilmedi";

    public int maas(){

        switch (personelTuru) {
            case "Doktor":
                return 5000;
            case "Hemsire" :
                return 3000;
            case "Bashemsire":
                return 4000;
            default:
                return 1900;

        }

    }
}
