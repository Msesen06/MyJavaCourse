package day15_MultiDimensionalarray_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_SetMethodu {
    public static void main(String[] args) {

        /*
        java get methodlari bize bilgi getirir
        set methodlari ise update eder guncelleme yapar
         */
        int[] sayilar={1,3,4,2,3,6,5,4,2,3,4,7,2};

        List<Integer> yeniList=new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            yeniList.add(sayilar[i]);
        }

        System.out.println(yeniList.set(0, 4));
        System.out.println(yeniList);
        yeniList.set(1,15);
        System.out.println(yeniList);
    }
}
