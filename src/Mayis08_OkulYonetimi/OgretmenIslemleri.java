package Mayis08_OkulYonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class OgretmenIslemleri implements I01_GenelIslemler{
    static ArrayList<Ogretmen> ogretmenList =new ArrayList<>();
    Anamenu anamenu =new Anamenu();
    //Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No
    //kimlik no ile silme ve arama

    Scanner scanner =new Scanner(System.in);

    void ogretmenMenu() {
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ" +
                "\tSECİMİNİZ:");
        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim){
            case '1' :{
                ekleme();

            }
            case '2' :{
                arama();

            }
            case '3' :{
                listeleme();
                ogretmenMenu();

            }
            case '4' :{
                silme();
                ogretmenMenu();
            }
            case 'Q' :{
                anamenu.menu();
            }
            default:{
                System.out.println("hatalı giris");
                ogretmenMenu();
            }
        }
    }

    public void silme() {
        //kimlik no ile silme
        System.out.println("SİLİNECEK ÖĞRETMENİN TC'SİNİ GİRİNİZ");
        String tcNo=scanner.next();
        int flag =0;
        for (Ogretmen each:ogretmenList
        ) {
            if (each.getKimlikNo().equals(tcNo))
            {
                ogretmenList.remove(each);
                System.out.println(each.getAd() + " ÖĞRETMEN silindi.");
                flag=1;
                break;
            }

        }
        if (flag==0){
            System.out.println("Silmek istediginiz ogretmen bulunmuyor");
            ogretmenMenu();
        }

    }

    public void listeleme() {
        for (Ogretmen each:ogretmenList
             ) {
            System.out.println(each);
        }
        if (ogretmenList.size()==0){
            System.out.println("Listelenecek Ögretmen yok");
        }
    }

   public void arama() {
        //kimlik no ile silme ve arama
        System.out.println("ARANACAK OGRETMENİN TC SİNİ GİRİNİZ");
        String tcNo =scanner.next();
        int flag =0;

        for (Ogretmen each:ogretmenList
        ) {
            if (each.getKimlikNo().equals(tcNo))
            {
                System.out.println("aradıgınız ogrenci :" +each);
                flag=1;
                break;

            }
        }
        if (flag==0){
            System.out.println("Aradıgınız ogrenci  bulunmuyor");
            ogretmenMenu();
        }

    }

    public void ekleme() {
        scanner.nextLine();
        System.out.println("Ögretmenin adını giriniz :");
        String ad =scanner.nextLine();
        System.out.println("Ögretmenin  soyadını giriniz :");
        String soyad =scanner.nextLine();
        System.out.println("Ögretmenin  tcsini giriniz :");
        String kimlikNo=scanner.nextLine();
        System.out.println("Ögretmenin  yasını giriniz :");
        int yas =scanner.nextInt();
        System.out.println("Ögretmenin  bolumunu giriniz :");
        String bolum =scanner.next();
        System.out.println("Ögretmenin  sicilini giriniz :");
        int sicil = scanner.nextInt();
        Ogretmen ogretmen =new Ogretmen(ad,soyad,kimlikNo,yas,bolum,sicil);
        ogretmenList.add(ogretmen);
        listeleme();
        ogretmenMenu();
    }
}
