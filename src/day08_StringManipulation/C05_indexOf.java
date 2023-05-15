package day08_StringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {
        String str ="Java en iyisi";
        System.out.println(str.indexOf("a")); //1
        System.out.println(str.indexOf("iyisi"));//8
        System.out.println(str.indexOf("güzel"));//-1
        System.out.println(str.indexOf("a", 2));// 3 2.indexten itibaren baslar.

        /*
        Soru :
        verilen bir cümlede istenen bir string icin
        1- aradığınız kelime cümlede bir kere kullanılmıs
        2- aradığınız kelime cümlede 2 veya daha fazla kullanılmış yazdırın

         */

        String str2="Java en  iyisi en güzeli";
        if (str2.indexOf("en")==-1){
            System.out.println("aradığınız kelime cümle içinde yoktur.");
        } else  {
            int birinci=str2.indexOf("en");
            if (str2.indexOf("en",birinci+1)==-1){
                System.out.println("aradığınız kelime 1 defa kullanılmıs");
            } else {
                System.out.println("aradığınız kelime 2 veya daha fazla kullanılmıs");
            }

        }


    }
}
