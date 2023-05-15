package day13_arrays;

import java.util.Arrays;

public class C07_TumElemanlariArttir {
    public static void main(String[] args) {
        /*Soru 1- Verilen bir int array’in tum elemanlarini istenen deger kadar
                  artirip bize donduren bir method
                  olusturun. Eski array’i yeni haliyle kaydedin

         */
        int[] arr ={1,2,5,7,11,3,4};
        int artisMiktari=6;
        arr =yeniArray(arr,artisMiktari);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] yeniArray(int [] arr1, int artisMiktari) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]+=artisMiktari;

        }
        return arr1;
    }
}
