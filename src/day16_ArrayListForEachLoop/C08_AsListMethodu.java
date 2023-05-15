package day16_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_AsListMethodu {
    public static void main(String[] args) {
        Integer[] sayilar ={1,4,3,5};


        //verilen bir arrayi liste cevirmek icin for loop kullanilmasini tavsiye ediyoruz
        //yine de gormek adina aslist kullanalim
        List<Integer> arraydenList= Arrays.asList(sayilar);
        arraydenList.set(0,5);
        System.out.println(arraydenList);
        //ekleme cikartma yapilamiyor
        // Array gibi davraniyor o yuzden tavsiye edilmez
        //kaynak array degisince arryList de degisir.

        List<Integer> list =new ArrayList<>();

        list.add(2);
        list.add(6);
        list.add(7);
        Integer[] array =list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));


    }
}
