package day31_iterators_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {
        Queue<String> yemekSirasi =new LinkedList<>();
        yemekSirasi.add("Murat");
        yemekSirasi.add("Muhammed");
        //murat ve muhammedin arasında bir eleman ekleyelim
        //sıralı liste oldugu icin Queue araya eleman eklenemez
        System.out.println("once "+yemekSirasi);
        yemekSirasi.remove();
        System.out.println("remove dan sonra :"+yemekSirasi);//bastakini siler
        yemekSirasi.add("Sevda");
        yemekSirasi.add("Veysel");
        yemekSirasi.add("Aysegul");

        System.out.println(yemekSirasi);//[Muhammed, Sevda, Veysel, Aysegul]
    }
}
