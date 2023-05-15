package day13_arrays;

import java.util.Arrays;

public class C09_ElemanKaydirma {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
                basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
                Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */
        int[] arr ={3,2,7,4};
        arr= elemanKaydir(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] elemanKaydir(int[] arr1) {
        int[] arr =new int[arr1.length];
        int temp =arr1[arr1.length-1];
        for (int i = 0; i < arr1.length-1; i++) {

                arr[i+1]=arr1[i];
                arr[0]=temp;

        }
        return arr;
    }
}
