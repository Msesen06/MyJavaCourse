package day18_parametreliConstructor_constructorCall;

public class C01_Hastane {
    static String hastaneAdi="Yildiz Hastanesi";
    static String getHastaneTel ="05433543212223";
    String personelAdi="İsim belirtilmedi";
    String personelAdres ="adres belirtilmedi";
    String personelTel ="Telefon belirtilmedi";
    String personelTuru ="Personel Turu belirtilmedi";

    public C01_Hastane(String isim, String adres, String tel, String tur){
        personelAdi=isim;
        personelAdres=adres;
        personelTel=tel;
        personelTuru=tur;
    }
    @Override
    public String toString() {
        return "C01_Hastane==>" +
                "personelAdi :'" + personelAdi + '\'' +
                ", personelAdres :" + personelAdres + '\'' +
                ", personelTel :" + personelTel + '\'' +
                ", personelTuru :" + personelTuru + '\'';
    }

    public C01_Hastane(String isim){
        System.out.println("isim parametreli constructor");
    }

    public C01_Hastane(){
        System.out.println("parametresiz constructor");
    }
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
