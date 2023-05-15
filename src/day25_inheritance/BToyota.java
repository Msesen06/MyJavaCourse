package day25_inheritance;

public class BToyota extends Araba{
    String uretimYeri;
    String marka="Toyota";
    BToyota(){

        System.out.println("Toyota constructor calıstı");
    }
    BToyota(int yil){
        this();
        System.out.println("Toyota int parametreli constructor calıstı.");
    }
}
