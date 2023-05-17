package day31_iterators_collections;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_Listiterator {
    public static void main(String[] args) {
        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(12);
        sayilar.add(14);

        System.out.println(sayilar);//[2, 5, 23, 12, 14]

        //index kullanmadan listenin tum elementlerine kalıcı olarak 2 ekleyin


        ListIterator lit = sayilar.listIterator();

        Integer sayi =0;
        while (lit.hasNext()){
            sayi =(Integer) lit.next();
            lit.set(sayi+2);
        }


        System.out.println(sayilar); //[4, 7, 25, 14, 16]


        // iterator kullanarak list'in elementlerini sondan basa yazdırın
        //iteratoru nerde bırakırsak orada kalır
        //basta oldugundan emin olmak istersek ye yeni iterator olustururuz
        //ya da loop body si bos olan bir while loop olusturulur.

        while (lit.hasPrevious()){
            System.out.print(lit.previous()+" ");//16 14 25 7 4
        }

        while (lit.hasNext()){
            lit.next();//sona alır.
        }

    }
}
