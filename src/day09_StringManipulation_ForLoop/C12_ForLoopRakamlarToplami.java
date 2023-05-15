package day09_StringManipulation_ForLoop;

import java.util.Scanner;

public class C12_ForLoopRakamlarToplami {
    public static void main(String[] args) {
        //Soru : kullanıcıdan pozitif bir sayı alıp rakamlar toplamını yazdırın


        int sayi = 1453;
        int basamakSayisi =(""+sayi).length();
        int rakamlarToplami=0;
        int rakam =0;
        for (int i = 1; i <=basamakSayisi; i++) {
            rakam =sayi%10;
            sayi=sayi/10;
            rakamlarToplami+=rakam;

        }
        System.out.println(rakamlarToplami);
    }
}
