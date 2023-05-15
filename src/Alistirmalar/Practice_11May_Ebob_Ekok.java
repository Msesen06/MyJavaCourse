package Alistirmalar;

public class Practice_11May_Ebob_Ekok {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı alıp ebob ve ekoklarını hesaplayalım

        int sayi1 =3;
        int sayi2=17;
        int buyukSayi =0;
        int kucukSayi =0;

        if (sayi1<sayi2) {
            kucukSayi=sayi1;
            buyukSayi =sayi2;
        } else {
            kucukSayi=sayi2;
            buyukSayi=sayi1;
        }

        for (int i = kucukSayi; i >= 1; i--) {
            if (sayi1%i==0 && sayi2%i==0){
                System.out.println("Sayıların EBOB'u :" +i);
                break;
            }
        }


        for (int i = buyukSayi; i <=sayi1*sayi2; i+=buyukSayi) {
            if (i%sayi1==0 && i%sayi2 ==0){
                System.out.println("Sayıların EKOK'u :" +i);
                break;
            }
        }
        int ekok =buyukSayi;
        while (ekok %kucukSayi!=0){
            ekok+=buyukSayi;
        }
        System.out.println("sayıların ekoku :"+ekok);
    }
}
