package day09_StringManipulation_ForLoop;

import java.util.Scanner;

public class C04_StringManipulation {
    public static void main(String[] args) {

        /*
        Soru Kullanicidan bir string alın
        String uzunlugu cift sayı ise tam ortasındakinisilin ve  :) ekleyin
        degilse :( ekleyin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime veya cümle yazın");
        String str = scanner.nextLine();
        int uzunluk =str.length();
        if (uzunluk%2==0){
            str =str.substring(0,uzunluk/2)+":)"+str.substring(uzunluk/2);

        } else {
            str =str.substring(0,(uzunluk-1)/2)+":("+str.substring((uzunluk+1)/2);
        }
        System.out.println(str);
    }
}
