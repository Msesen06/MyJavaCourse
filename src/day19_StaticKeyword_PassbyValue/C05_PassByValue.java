package day19_StaticKeyword_PassbyValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        int fiyat =200;
        //fiyat uzerinde %10 indirim yapıp yeni fiayti yazdiran bir method olusturun
        indirimYap10(fiyat);
        System.out.println("indirimli fiyat yazdirildiktan sonra :" +fiyat);
    }
    public static void indirimYap10(double fiyat){
        fiyat=fiyat*90/100;
        System.out.println("indirimli fiyat :" +fiyat);
        /*
        methodda yazdigimiz parametre ismi main methoddaki variable ile ayni olmak zorunda degil
        ama kodun anlasilabilir olmasi icin ayni secilmelidir.
         */

    }
}
