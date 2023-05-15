package day14_arrays;

import java.util.Arrays;

public class C03_BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2,5,6,4,2,1,0,5,8,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,7));
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr,100));

        // iki arrayin esitligi kontrol edilirken Arrays classindan  equal methodu kullanilir
        int[] arr1 ={2,5,6,4,2,4,0,5,8,9};
        System.out.println(Arrays.equals(arr,arr1));
        // split methodu kullanilarak bir string ifade arraye cevrilebilir.

        String str ="Ali topu at topu bana at.";
        String[] spl =str.split("  ");// bosluklardan ayirarak arraye cevirdi
        System.out.println(Arrays.toString(spl));


    }
}
