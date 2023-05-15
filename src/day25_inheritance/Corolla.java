package day25_inheritance;

import day25_inheritance.BToyota;
import day25_inheritance.Araba;

public class Corolla extends BToyota {
    String uretimYeri ="Turkiye";
    String model="Corolla";
    Corolla(){
        this("elektrik");
        System.out.println("Corolla constructor calıstı.");
    }
    Corolla(int sayi){
        this();
        System.out.println("Corolla int parametreli constructor calıstı.");
    }
    Corolla(String yakit){
        super(5);
        System.out.println("Corolla string parametreli contructor calisti.");
    }
    public static void main(String[] args) {

        Corolla corolla1=new Corolla("benzin");

    }
}
