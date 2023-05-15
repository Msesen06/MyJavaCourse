package day15_MultiDimensionalarray_ArrayList;

import java.util.Arrays;

public class C01_Yazdirma {
    public static void main(String[] args) {
        /*
        mda'da yazdirmak istedigimiz bir element ise direkt yazdirabiliriz
        tek katlı bir arrayse Arrays.toString methodu kullanmaliyiz.
        cok katli arrayse deepToSting methodu kullanilmalidir.
         */
        int[][] arraylar={{1,2,5,8},{3,9,11,45},{23,34,22},{4,7,9,11}};
        System.out.println(arraylar[1][2]);
        System.out.println(Arrays.toString(arraylar[0]));
        System.out.println(Arrays.deepToString(arraylar));

    }
}
