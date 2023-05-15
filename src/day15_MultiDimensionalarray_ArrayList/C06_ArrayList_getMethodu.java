package day15_MultiDimensionalarray_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList_getMethodu {
    public static void main(String[] args) {
        //eger uzun bir liste yapmak istiyorsak
        //bir array olusturup loop loop ile tum elemanlari
        // list'e ekleyebiliriz.
        int[] sayilar={1,3,4,2,3,6,5,4,2,3,4,7,2};

        List<Integer> yeniList=new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            yeniList.add(sayilar[i]);
        }
        System.out.println("yeni Liste :"+yeniList);

        String[] harfler ={"a","b","d","f","e","r","s","w","r"};

        List<String> harfList =new ArrayList<>();
        for (int i = 0; i < harfler.length; i++) {
            harfList.add(harfler[i]);
        }
        System.out.println(harfList.get(5));
        System.out.println(harfList);
        System.out.println(harfList.get(0));
        System.out.println(harfList.get(harfList.size()-1));


    }
}
