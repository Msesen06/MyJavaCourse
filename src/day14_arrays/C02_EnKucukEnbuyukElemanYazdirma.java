package day14_arrays;

import java.util.Arrays;

public class C02_EnKucukEnbuyukElemanYazdirma {
    public static void main(String[] args) {
        int[] arr ={1,2,5,7,8,3,4,7,0,4,5,5,7,33};
       // sadece sayilar degil kelimeleri de siralar

        String[] list ={"Ali","Zeynep","Tarik"};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(arr));
        enBuyukEnKucukElemanYazdirma(arr);
    }

    public static void enBuyukEnKucukElemanYazdirma(int[] arr) {
        Arrays.sort(arr);
        System.out.println("en kucuk eleman :"+arr[0]+
                "\nen buyuk eleman :"+arr[arr.length-1]);

    }
}
