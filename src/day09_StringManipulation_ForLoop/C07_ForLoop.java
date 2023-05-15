package day09_StringManipulation_ForLoop;

import java.util.Scanner;

public class C07_ForLoop {
    public static void main(String[] args) {
        //Soru verilen iki sayı ve arasındaki sayıları toplayıp yazdırın
        // hangi sayının buyuk oldugu bilinmiyor
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir sayı girin");
        int sayi1 = scanner.nextInt();
        System.out.println("lütfen bir sayı daha girin");
        int sayi2 = scanner.nextInt();
        int sayilarToplami=0;
        if (sayi1<sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                sayilarToplami+=i;
            }
        } else {
            for (int i = sayi2; i <=sayi1; i++) {
                sayilarToplami+=i;
            }

        }
        System.out.println(sayilarToplami);

    }
}
