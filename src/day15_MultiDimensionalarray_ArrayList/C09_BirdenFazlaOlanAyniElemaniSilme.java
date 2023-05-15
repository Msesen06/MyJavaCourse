package day15_MultiDimensionalarray_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_BirdenFazlaOlanAyniElemaniSilme {
    public static void main(String[] args) {
        int[] sayilar={1,3,4,2,3,6,5,4,2,3,4,7,2};

        List<Integer> yeniList=new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            yeniList.add(sayilar[i]);
        }

        System.out.println(yeniList);

        Integer silinecek =2;

        while (yeniList.contains(silinecek)){
            yeniList.remove(silinecek);
        }
        System.out.println(yeniList);


    }
}
