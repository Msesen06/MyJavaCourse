package day15_MultiDimensionalarray_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_Remove {
    public static void main(String[] args) {
        /*
        java girilen sayıyı direkt index olarak kabul eder.
        eger object olarak silmek istersek silinecek bir Integer variable atanır
        ve bu remove'da yazılarak silme islemi yapılır.
        eger birden fazla ise ilkini siler
         */
        int[] sayilar={1,3,4,2,3,6,5,4,2,3,4,7,2};

        List<Integer> yeniList=new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            yeniList.add(sayilar[i]);
        }
        System.out.println(yeniList.remove(3));
        System.out.println(yeniList);
        Integer silinecek =5;
        System.out.println(yeniList.remove(silinecek));
        System.out.println(yeniList);
    }
}
