package Mayis08_OkulYonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciIslemleri {
    ArrayList<Ogrenci> ogrenciList =new ArrayList<>();
    Anamenu anamenu =new Anamenu();
    //Öğrenci:  Ad-Soyad,  kimlik No, yaş,numara, sınıf
    //kimlik no ile silme ve arama
    Scanner scanner =new Scanner(System.in);
    void ogrenciMenu(){
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ"+
                "\tSECİMİNİZ:");
        char secim =scanner.next().toUpperCase().charAt(0);

        switch (secim){
            case '1' :{
                ekleme();

            }
            case '2' :{
                arama();

            }
            case '3' :{
                listeleme();
                ogrenciMenu();

            }
            case '4' :{
                silme();
                ogrenciMenu();
            }
            case 'Q' :{
                anamenu.menu();
            }
        }

    }

    private void silme() {
        //kimlik no ile silme
        System.out.println("SİLİNECEK ÖĞRENCİNİN TC SİNİ GİRİNİZ");
        String tcNo=scanner.next();
        int flag =0;
        for (Ogrenci each:ogrenciList
             ) {
            if (each.getKimlikNo().equals(tcNo))
            {
               ogrenciList.remove(each);
                System.out.println(each.getAd() +" ÖĞRENCİ silindi.");
                flag=1;
                break;
            }

        }
        if (flag==0){
            System.out.println("Silmek istediginiz ogrenci bulunmuyor");
            ogrenciMenu();
        }

    }

    private void arama() {
        //kimlik no ile silme ve arama
        System.out.println("ARANACAK OGRENCİNİN TC'SİNİ GİRİNİZ");
        String tcNo =scanner.next();
        int flag =0;

        for (Ogrenci each:ogrenciList
             ) {
            if (each.getKimlikNo().equals(tcNo))
            {
                System.out.println("ARADIĞINIZ ÖĞRENCİ :" +each);
                flag=1;
                break;

            }
        }
        if (flag==0){
            System.out.println("ARADIĞINIZ ÖĞRENCİ BULUNMUYOR");
            ogrenciMenu();
        }
    }

    private void listeleme() {
        for (Ogrenci each:ogrenciList
             ) {
            System.out.println(each);
        }
        if (ogrenciList.size()==0){
            System.out.println("BU SINIFTA ÖĞRENCİ YOK");
        }
    }

    private void ekleme() {
        scanner.nextLine();
        System.out.println("Ögrencinin adını giriniz :");
        String ad =scanner.nextLine();
        System.out.println("Ögrencinin soyadını giriniz :");
        String soyad =scanner.nextLine();
        System.out.println("Ögrencinin tcsini giriniz :");
        String kimlikNo=scanner.nextLine();
        System.out.println("Ögrencinin yaşını giriniz :");
        int yas =scanner.nextInt();
        System.out.println("Ögrencinin numarasını giriniz :");
        int numara =scanner.nextInt();
        System.out.println("Ögrencinin sınıfını giriniz :");
        String sinif = scanner.next();
        Ogrenci ogrenci =new Ogrenci(ad,soyad,kimlikNo,yas,numara,sinif);
        ogrenciList.add(ogrenci);
        listeleme();
        ogrenciMenu();

    }

}
