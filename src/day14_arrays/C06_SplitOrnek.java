package day14_arrays;

import java.util.Arrays;

public class C06_SplitOrnek {
    public static void main(String[] args) {
        //Strda kac tane "java" kelimesi geciyor
        String str ="Java yilin bu zamanlarinda bir baska guzel oluyor. Java olmadan java ogrenilmez.";
        String aranan="java";
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        int sayac =0;
        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].equalsIgnoreCase("java")){
                sayac++;
            }
        }
        System.out.println("verilem metinde "+sayac+" tane "+aranan+" ifadesi vardir");

    }
}
