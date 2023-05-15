package Alistirmalar;

import java.util.Scanner;

// Soru : Doviz almak ya da satmak isteyen kullanıcıyı once asagıdaki gibi bir menuyla karsılayıp
        // kullanıcının secim yapıp islemlerini girisMenu() methodu ile doviz alımı icin dovizAlim() methodu
        // ile satısı icin dovizSatis() methodu ile yonlendiren bir program yazın
public class C05_DovizBurosu {

    static Scanner scanner =new Scanner(System.in);
    static double kurDolarAlis =20.28;
    static double kurdolarSatis=20.58;
    static double kurEuroalis=22.26;
    static double kurEuroSatis=22.66;
    public static void main(String[] args) {
        girisMenu();
    }

    public static void girisMenu() {
        System.out.println("*******************QA Döviz Bürosu*****************\n"+
                "\t\t\tAlış \t\t Satış\n"+
                "Dolar:\t\t"+20.67+"\t\t"+19.9+"\n"+
                "Euro:\t\t"+20.97+"\t\t"+21.27);
        System.out.println("---------------------------------------");
        System.out.println("doviz almak icin 1 'e basın");
        System.out.println("doviz satmak icin 2'e basın");
        int secim = scanner.nextInt();
        if (secim==1){
            dovizAlim();
        } else if (secim==2) {
            dovizSatis();

        } else {
            System.out.println("Hatalı giris yaptınız: lütfen tekrar deneyin");
            girisMenu();
        }
    }
    public static void dovizAlim() {
        System.out.println("Dolar almak icin D'ye , Euro almak icin E ye basınız .");
        Character dovizTuru =scanner.next().toUpperCase().charAt(0);
        if (dovizTuru.equals('D')){
            System.out.println("lütfen tl miktarını giriniz:");
            int tl = scanner.nextInt();
            double dolar =tl/kurDolarAlis;
            System.out.println(tl+ "TL ile "+dolar+" alabilirsiniz." );
        } else if (dovizTuru.equals('E')) {
            System.out.println("lütfen tl miktarını giriniz:");
            int tl = scanner.nextInt();
            double euro=tl/kurEuroalis;
            System.out.println(tl+ "TL ile "+euro+" alabilirsiniz." );
        } else {
            System.out.println("hatalı giris yaptınız tekrar deneyiniz.");
            dovizAlim();
        }
    }

    public static void dovizSatis() {
        System.out.println("Dolar satmak icin D'ye , Euro satmak icin E ye basınız .");
        Character dovizTuru =scanner.next().toUpperCase().charAt(0);


        if (dovizTuru.equals('D')){
            System.out.println("Dolar miktarını giriniz :");
            double dolar = scanner.nextDouble();
            double tl =kurdolarSatis*dolar;
            System.out.println(dolar+" dolar "+tl+" TL eder.");
        } else if (dovizTuru.equals('E')) {
            System.out.println("Euro miktarını giriniz :");
            double euro = scanner.nextDouble();
            double tl =kurEuroSatis*euro;
            System.out.println(euro+" euro "+tl+" TL eder.");
        }else {
            System.out.println("hatalı giris yaptınız lütfen tekrar deneyin");
            dovizSatis();
        }
    }


}
