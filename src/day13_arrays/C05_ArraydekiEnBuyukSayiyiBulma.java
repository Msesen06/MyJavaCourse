package day13_arrays;

import java.util.Arrays;

public class C05_ArraydekiEnBuyukSayiyiBulma {
    public static void main(String[] args) {
        //verilen arraydeki en buyuk sayiyi bulma
        int[] arr ={1,2,5,7,11,3,4};

        int enBuyukSayi =enBuyukElementiBul(arr);
        System.out.println(enBuyukSayi);

    }

   public static int enBuyukElementiBul(int[] arr1) {
        int enbuyuk=arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]>enbuyuk){
                enbuyuk=arr1[i];
            }
        }
       System.out.println("arraydeki en buyuk eleman : "+enbuyuk);



        return enbuyuk;
    }
}
