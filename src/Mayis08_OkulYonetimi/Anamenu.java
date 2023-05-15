package Mayis08_OkulYonetimi;

import java.util.Scanner;

public class Anamenu {
    Scanner scanner =new Scanner(System.in);
    OgrenciIslemleri ogrenciIslemleri;
    OgretmenIslemleri ogretmenIslemleri;

    void menu(){
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ"+
                "\n SECİNİZ: ");

        char secim =scanner.next().toUpperCase().charAt(0);

        switch (secim){
            case '1' :{
                ogrenciIslemleri =new OgrenciIslemleri();
                ogrenciIslemleri.ogrenciMenu();
            }
            case '2' :{
                    ogretmenIslemleri=new OgretmenIslemleri();
                    ogretmenIslemleri.ogretmenMenu();

            }
            case 'Q' :{

            }
        }

    }
}
