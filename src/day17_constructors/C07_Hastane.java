package day17_constructors;

public class C07_Hastane {

    /*
    biz bir constructor olusturdugumuzda java default u siler.
    gorunur constructor olusturdugumuzda daha once default constructor kullanarak olusturulan
    objeler CTE  verir
    boyle bir soruna sebep olmamak icin default constructor islevini goren bir constructor olustururuz

     */
    static String hastaneAdi = "Yildiz Hastanesi";
    static String getHastaneTel = "05433543212223";
    String personelAdi = "İsim belirtilmedi";
    String personelAdres = "adres belirtilmedi";
    String personelTel = "Telefon belirtilmedi";
    String personelTuru = "Personel Turu belirtilmedi";

    public int maas() {

        switch (personelTuru) {
            case "Doktor":
                return 5000;
            case "Hemsire":
                return 3000;
            case "Bashemsire":
                return 4000;
            default:
                return 1900;

        }
    }
    public C07_Hastane(String isim){
        System.out.println("isim parametreli constructor");
    }

    public C07_Hastane(){
        System.out.println("parametresiz constructor");
    }

    @Override
    public String toString() {
        return "C07_Hastane ==>" +
                "personelAdi:'" + personelAdi + '\'' +
                ", personelAdres:'" + personelAdres + '\'' +
                ", personelTel :'" + personelTel + '\'' +
                ", personelTuru :'" + personelTuru + '\'';
    }
}