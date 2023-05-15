package day14_arrays;

import java.util.Arrays;

public class C01_ElemanKaydirma {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
                basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
                Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */

        int[] arr ={1,2,7,4};
        arr= elemanKaydir(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] elemanKaydir(int[] arr1){

        int temp =arr1[arr1.length-1];
        for (int i = arr1.length-2; i>=0; i--) {
            arr1[i+1]=arr1[i];
        }
        arr1[0]=temp;
        return arr1;
    }
}
