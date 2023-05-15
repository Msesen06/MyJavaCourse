package day19_StaticKeyword_PassbyValue;

public class C06_PassByValue {
    public static void main(String[] args) {
       double fiyat =200;
       //verilen fiyattan 10% inidirim yapip yeni fiyati bize donduren bir method olusturun

        System.out.println(indirimYap10(fiyat));
        System.out.println("indirimli fiyat yazdirdiktan sonra fiyat :" +fiyat);
        //degisikligi kalici hale getirmek icin
        fiyat =indirimYap10(fiyat);
        System.out.println(fiyat);
        System.out.println(indirimYap10(400));
    }
    public static double indirimYap10(double fiyat){
        fiyat =fiyat*90/100;
        return fiyat;
    }
}
