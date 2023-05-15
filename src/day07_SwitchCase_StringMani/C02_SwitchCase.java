package day07_SwitchCase_StringMani;

import java.util.Date;
import java.util.Scanner;
import java.util.Date.*;

public class C02_SwitchCase {
    public static void main(String[] args) {

        Date tarih =new Date();
        System.out.println(tarih.toString());

        //soru 2: kullanıcıdan ay numarasını  alın  o ayın
        // hangi mevsimde olduğunu yazdırın

        // kullanıcı 1  girdiğinde kıs yazdırsın

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen ay numarasını girin :");
        int ay = scanner.nextInt();


        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("KIŞ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İLKBAHAR");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("YAZ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("SONBAHAR");
                break;
            default:
                System.out.println("GECERSİZ HARF");
        }
             // SORU Girilen 2 basamaklı bir sayıyı yazıyla yazdırın

                System.out.println("lütfen üç basamaklı bir sayı girin");
                int sayi1= scanner.nextInt();
                int birler =sayi1%10;
                int onlar =sayi1/10;
                onlar=onlar%10;
                int yuzler =sayi1/100;

                if ((sayi1>=100 && sayi1<=999)) {
                    switch (yuzler) {
                        case 1 :
                            System.out.print("yüz ");
                            break;
                        case 2:
                            System.out.print("iki yüz ");
                            break;
                        case 3:
                            System.out.print("üç yüz ");
                            break;
                        case 4:
                            System.out.print("dört yüz ");
                            break;
                        case 5:
                            System.out.print("beş yüz ");
                            break;
                        case 6:
                            System.out.print("altı yüz ");
                            break;
                        case 7:
                            System.out.print("yedi yüz ");
                            break;
                        case 8:
                            System.out.print("sekiz yüz ");
                            break;
                        case 9:
                            System.out.print("dokuz yüz ");
                            break;
                    }

                    switch (onlar) {
                        case 1 :
                            System.out.print("on ");
                            break;
                        case 2:
                            System.out.print("yirmi ");
                            break;
                        case 3:
                            System.out.print("otuz ");
                            break;
                        case 4:
                            System.out.print("kırk ");
                            break;
                        case 5:
                            System.out.print("elli ");
                            break;
                        case 6:
                            System.out.print("altmış ");
                            break;
                        case 7:
                            System.out.print("yetmiş ");
                            break;
                        case 8:
                            System.out.print("seksen ");
                            break;
                        case 9:
                            System.out.print("doksan ");
                            break;
                    }

                    switch (birler) {
                        case 1 :
                            System.out.print("bir");
                        break;
                        case 2:
                            System.out.print("iki");
                        break;
                        case 3:
                            System.out.print("üç");
                        break;
                        case 4:
                            System.out.print("dört");
                        break;
                        case 5:
                            System.out.print("beş");
                        break;
                        case 6:
                            System.out.print("altı");
                        break;
                        case 7:
                            System.out.print("yedi");
                        break;
                        case 8:
                            System.out.print("sekiz");
                        break;
                        case 9:
                            System.out.print("dokuz");
                        break;

                    }


                } else {
                    System.out.println("gecersiz giris");
                }


    }
}
