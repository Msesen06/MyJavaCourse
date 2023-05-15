package day17_constructors;

public class C03_Hastane {
    static String hastaneAdi="Yildiz Hastanesi";
    static String getHastaneTel ="05433543212223";
    String personelAdi="İsim belirtilmedi";
    String personelAdres ="adres belirtilmedi";
    String personelTel ="Telefon belirtilmedi";
    String personelTuru ="Personel Turu belirtilmedi";

    public int maas(String personelTuru){

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
