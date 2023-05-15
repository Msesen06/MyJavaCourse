package day14_arrays;

import day13_arrays.C03_ArrayinTumElementleriniToplama;
import day13_arrays.C05_ArraydekiEnBuyukSayiyiBulma;
import day13_arrays.C07_TumElemanlariArttir;

import java.util.Arrays;

public class C07_MethodlariKullanma {
    public static void main(String[] args) {
        int[] arr ={1,2,5,4,3,6};
        C03_ArrayinTumElementleriniToplama.elementler_Toplam(arr);
        System.out.println(C05_ArraydekiEnBuyukSayiyiBulma.enBuyukElementiBul(arr));
        System.out.println(Arrays.toString(C07_TumElemanlariArttir.yeniArray(arr, -2)));
        System.out.println("Arrayiniz :"
                +Arrays.toString(C08_KullanicidanArrayOlusturma.ArrayOlusturma()));
    }
}
