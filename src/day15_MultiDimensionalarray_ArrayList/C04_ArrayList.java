package day15_MultiDimensionalarray_ArrayList;

import day14_arrays.C09_KullanicidanAldigimizDegeriArrayeEkleme;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArrayList {
    public static void main(String[] args) {
        // array uzunlugu degistirilmedigi icin calisma ortaminda pek tercih edilmez.
        //java eleman eklecegimiz ve silecegimiz bir yapı kurmustur. Arraylist
        // arraylist olsuturmak :

        int[] arr ={2,3,4,7};
        arr =C09_KullanicidanAldigimizDegeriArrayeEkleme.ArrayaElemanEkle(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(5);
        System.out.println(sayilar);

        //arraylistin tek dezavantajı elemanlari tek tek eklenememesi
    }
}
