package day29_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_tryCatch {
    public static void main(String[] args) {
        //kullanıcıdan toplanmak uzere sayı alın
        //kullanıcı tamsayı girmezse hata mesajı verir tekrar isteyin
        //kullanıcı islemi bitirmek icin q ya basacaktır.
        //islem bittiginde kac tane gecerli sayı girdigini ve sayıların toplamını yazdırın

        int sayi =0;
        int toplam =0;
        int sayac =0;
        boolean sayiIste =true;
        String tercih ="";

        Scanner scanner =new Scanner(System.in);

        while (sayiIste){
            System.out.println("bir tamsayı girin :");

            try {
                sayi= scanner.nextInt();
                toplam+=sayi;
                sayac++;

            } catch (InputMismatchException e) {
                tercih = scanner.next();
                if (tercih.equalsIgnoreCase("q")){
                    break;
                } else {
                    System.out.println("tamsayı girmelisiniz");
                }
            }
        }
        System.out.println(sayac+ " sayı girdiniz."+" toplam :" +toplam);

    }
}
