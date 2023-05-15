package day12_doWhile_scope;

public class C06_ClassLevelVariables {
    /*
        bir class'in tamaminda gecerli olan variable olusturmak istersek bu variable'lari
        class level'da olusturmamiz lazim.
        yani classin icinde ama methodlarin disinda olusturmaliyiz

        class level variable'lar classin en ustunde olmasi zorunlu degildir
        ama convention geregi ustte olsa daha iyi olur

        class level variable'lar static ve static olmayan (intsance) seklinde iki farkli sekilde
        olusturulabilir.

        static variable'lar static olarak isaretlenir basinda static ifadesi bulunur.
        tum methodlara gidebilir ve her methodda kullanilabilir.
         instance variable'lar static olmadiklari icin bu defa karar verici olarak methodlar
         devreye girerler.
         m
     */

    static int sayi=10;//static variable
    String str ="java guzeldir.";//instance static olmayan variable

    public static void main(String[] args) {
        sayi=20;
        System.out.println(sayi);//20 en
     // System.out.println(str);// main method static ve str variable'i instance oldugu icin kabul etmedi



    }
    public static void staticMethod(){
        sayi=30;
        //str="java can";
        //str="hava"; str static degil
    }
    public void staticOlmayanMethod(){

        str="java candir"; // ikisi de static olamdigindan kabul etti
        System.out.println(str);
    }
}
