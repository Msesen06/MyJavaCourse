package day09_StringManipulation_ForLoop;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        String str="Hello World";
        System.out.println(str.repeat(10)+" ");

        // 1'den 100'e kadar sayilari yazdirin
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i+"-");
        }

        // 3 basamaklı cift sayıları yazdırın
        int sayilarToplami=0;
        for (int i = 100; i < 1000; i+=2) {
            sayilarToplami+=i;
        }
        System.out.println(sayilarToplami);





    }
}
