package day06_ifELse_Ternary;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldığı ürün adedi ve liste fiyatını alın
        kullaıcıya müsteri kartı olup olmadığını sorun
        varsa 10 üründen fazla alırsa 20% indirim yoksa 15% ;
        kart yoksa 10 üründen fazla alırsa 15%, az alırsa 10% indirim yapın

        */

        Scanner scanner =new Scanner(System.in);
        System.out.println("kac tane alacaksınız :");
        int adet = scanner.nextInt();
        System.out.println("fiyatını giriniz :");
        double fiyat = scanner.nextDouble();
        System.out.println("Müşteri kartınız var mı \n varsa V'ye yoksa Y'ye basın");
        char kartVarmi =scanner.next().toUpperCase().charAt(0);
        double toplamOdeme=adet*fiyat;



        if (kartVarmi=='V') {
            if (adet >=10){
                System.out.println("yüzde 20 indirim kazandınız, ödemeniz gereken:"+toplamOdeme+" TL'dir"+
                        "\nYüzde 20 indirimli Ödeme miktarı :"+(toplamOdeme*0.80)+" TL'dir" );
            } else if (adet<10 && adet>0) {
                System.out.println("yüzde 15 indirim kazandınız, ödemeniz gereken:"+toplamOdeme+" TL'dir"+
                        "\nYüzde 15 indirimli Ödeme miktarı : "+(toplamOdeme*0.85)+" TL'dir" );
            } else{
                System.out.println("gecersiz giris");
            }

        } else if (kartVarmi=='Y') {
            if (adet>=10){
                System.out.println("yüzde 15 indirim kazandınız, ödemeniz gereken:"+toplamOdeme+" TL'dir"+
                        "\nYüzde 15 indirimli Ödeme miktarı : "+(toplamOdeme*0.85)+" TL'dir" );
            } else if (adet<10 && adet>0) {
                System.out.println("yüzde 10 indirim kazandınız, ödemeniz gereken:"+toplamOdeme+" TL'dir"+
                        "\nYüzde 10 indirimli Ödeme miktarı : "+(toplamOdeme*0.90)+" TL'dir" );
            } else {
                System.out.println("gecersiz giris");
            }

        } else {
            System.out.println("gecersiz giriş");
        }



    }
}
