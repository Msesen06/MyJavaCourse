package day18_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {
        C01_Hastane per1 =new C01_Hastane();
        per1.personelAdi="Sevda";
        per1.personelAdres="Ankara";
        per1.personelTel="56474838839";
        per1.personelTuru="Doktor";
        System.out.println(per1);

        // atamayı yaptigimiz icin yeni degerlerini yazdirdi

       C01_Hastane per2 =new C01_Hastane("Ayla","Cankaya","453636","Doktor");

        System.out.println(per2);

        C01_Hastane per3 =new C01_Hastane("ali","urfa","5427654311","hemsir");
        System.out.println("Per3 :"+per3);


    }


}
