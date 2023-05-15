package day01_05;

import java.util.Scanner;

public class day05 {
    public static  void dersTarihi(){
        System.out.println("27 mart 2023 pazartesi");
    }

    public static void main(String[] args) {
        dersTarihi();
        // if else statements

        /*
        eger if sartından sonra süslü parantez kullanılmazsa java ilk noktalı virgüle kadar olan kısmı
        if bodysi olarak kabul eder

        */

        int a=20;
        int b =75;

        if (a<b){
            System.out.println("a, b'den küçüktür");
        }

        if (a%5==0){
            System.out.println("a, 5'e tam bölünür");
        }
        if ( a%4==0) System.out.println("a 4'e tam bölünür");
        if (true){
            System.out.println("bu kod her zaman calısır");
        }

        //soru 2: kullanıcıdan bir harf alın
        //buyuk kucuk duyarlı olmsın
        // kullanıcı o veya O girdiğinde ocak yazdırsın

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen vir ayın ilk harfini girin");
        char harf =scanner.nextLine().toUpperCase().charAt(0);

        if (harf=='O') {
            System.out.println("OCAK");
        }
        if (harf=='Ş') {
            System.out.println("ŞUBAT");

        }
        if (harf=='M') {
            System.out.println("MART veya MAYIS");
        }

        //soru 3 kullanıcdan bir sayı alın sayı 3 e bölünüyorsa 3 . 5  e bölünüyorsa 5 e bölünüyor yazdırın
        System.out.println("lütfen bir sayı girin");
        int sayi1=scanner.nextInt();
        if (sayi1%3==0){
            System.out.println("sayı 3'e bölünebiliyor");
        }
        if (sayi1%5==0){
            System.out.println("sayı 5'e bölünebiliyor");
        }

        // soru 4 kullanıcdan bir sayı alın , sayının 2,3,5,7,11,ve 23 sayılarından kac tanesine bölündüğünü yazdırın
        System.out.println("lütfen bir sayı daha girin");
        int sayi2 =scanner.nextInt();
        int sayac=0;
        if (sayi2%2==0) sayac++;
        if (sayi2%3==0) sayac++;
        if (sayi2%5==0) sayac++;
        if (sayi2%7==0) sayac++;
        if (sayi2%11==0) sayac++;
        if (sayi2%23==0) sayac++;
        System.out.println("Girdiğiniz sayı 2 ,3 ,5,7,11 ve 23 sayılarından " + sayac + " tanesine tam bölünüyor");

        // soru 5 kullanıcıdan bir sayı alın eğer sayı 50den büyükse gectin , küçükse kaldın yazdırın

        System.out.println("lütfen notunuzu giriniz :");
        int not =scanner.nextInt();

        if (not > 50) System.out.println("Tebrikler gectiniz.");
        if (not < 50) System.out.println("Maalesef Kaldınız.");
         if ( not >=50) {
             System.out.println("gectiniz");
         } else {
             System.out.println("kaldınız");
         }

         //soru kullanıcıdan bir karakter alın büyük harf ise yazdırın degilse olmadığını belirtin
        System.out.println("lütfen bir harf giriniz");
        char harf2 =scanner.next().charAt(0);
        if (harf2 >= 'A'&& harf2 <='Z') {
            System.out.println("girilen karakter büyük bir harf");
        } else {
            System.out.println("girdiğiniz karakter bir harf değildir");
        }
        //
        System.out.println("bir harf girin");
        char harf3 =scanner.next().charAt(0);
        if (harf3>='a'&& harf3<='z'){
            System.out.println("girlen harfin yeni hali "+Character.toUpperCase(harf3));
        } else {
            System.out.println(harf3);
        }

        // 0 dan kücük veya 100den büyükse gecersiz not
        // 85den büyük  ise AA, 70den büyük BB, 50 den büyük CC , 50den kücük ise FF
        System.out.println("notunuzu giriniz");
        int not2= scanner.nextInt();
        if (not2>100 || not2 <0) {
            System.out.println("not gecersiz");
        } else if (not2>=85) {
            System.out.println("notunuz :AA Cok iyi.");
        } else if (not2>=70) {
            System.out.println("Notunuz :BB İyi");
        } else if (not2>=50 ) {
            System.out.println("Notunuz :CC Normal");

        } else {
            System.out.println("Notunuz :FF Kaldınız");
        }

        /*
         else body si ile bitmelidir
         soru kullanıcıdan cinsiyetini ve yasını alın
         kadın 60 ve üzeri emekli oalbilir
         erkek 65 ve üzeri emekli olabilir
         emekli olabilirsin veya emekli olmak için su kadar yıl çalışman gerekir yazdırın
        */
        System.out.println("lütfen yaşınız giriniz :");
        int yas =scanner.nextInt();
        System.out.println("lütfen cinsiyetiniz yazın kadın K , erkek ici E");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        if ((cinsiyet!='K' && cinsiyet!='E') || yas<10 || yas>80){
            System.out.println("gecersiz giris");
        }
        if ((cinsiyet=='K' &&yas>=60) || (cinsiyet=='E' && yas>=65)){
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("emekli olmak için daha "+(60-yas)+" yıl çalışmanız gerekir");

        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("emekli olmak için "+(65-yas)+" yıl daha çalışmanız gerekir");
        }


    }

}
