package day30_Exceptions;

import java.util.ArrayList;
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
         */
    }
}
