package day26_InheritanceDatatypeKullanimi_Overriding;

public class Overriding1 {
    /*
    overriding child class ta olusturulan bir methodun
    parent classtaki ayni isim ve signature a sahip olan
    methodu gecersiz kılmasıdır.

    return type ve access modifier signature a dahil degildir.
    return type aynı olması degildir.
    ancak ikisi  icin ozel bır kural vardır


     */
    void method1(){
        System.out.println("overridig1 method1");
    }
    Object method2() {
        System.out.println("overridig1 method2");
        return 2;
    }
}
