package day30_Exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_iterator {
    public static void main(String[] args) {
        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);
        System.out.println(sayilar);

        //list teki elementlere 2 ekleyip kaydedin

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i)+2);
        }
        System.out.println(sayilar);

        /*
        javada farklı ozelliklere sahip birden fazla element icerebilen yapılar vardır.
        bugune kadar array ve list gorduk.
        collections (linkedList, queue, deque,Set)
        sonra map
        Bu yapıların hepsi index kullanmaz
         */

        //index kullanmadan list elemenlerini 2 arttirin

        for (Integer each:sayilar
             ) {
            System.out.print(each+2 +" ");
        }
        System.out.println("");
        System.out.println(sayilar);

        // foreach kullanarak listin elementlerini  2 arrtırıp kaydedin
        for (Integer each:sayilar
             ) {
            each+=2;
        }
        System.out.println(sayilar);
        Iterator itr = sayilar.iterator();
        itr.next();
        itr.remove();
        itr.next();
        itr.remove();
        itr.next();
        itr.remove();
        System.out.println(sayilar);
    }
}
