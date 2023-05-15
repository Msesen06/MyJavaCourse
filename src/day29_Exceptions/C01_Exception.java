package day29_Exceptions;

import java.util.Scanner;

public class C01_Exception {
    public static void main(String[] args) {

        //kullanıcıdan iki tam sayı alıp
        //ilk sayıyı ikinciye bolun
        // ve sonucu yazdırın
        /*
        kodlarımızı yazarken kullanıcı tarafından yapılabilecek hataları ongorebiliyorsak
        javaya bu hata ihitmalleri icin yapması gerekenleri soyleyebilriiz.
        ancak tum sorunları if else ile cozmek mumkun degildir.
        oremgin istenen data turune uygun olmayan bir input girilimesini
        if else ile cozemeyiz
        Java bunun icin bir interface olsuturmustur
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("bolunecek sayıyı girin :");
        int sayi1 = scanner.nextInt();
        System.out.println("bolen sayıyı girin :");
        int sayi2 = scanner.nextInt();
        if (sayi2==0){
            System.out.println("0'a bolunemez");
        } else {
            System.out.println("iki sayının bolme sonucu :" +sayi1/sayi2);
        }

    }
}
