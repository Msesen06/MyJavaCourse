package day15_MultiDimensionalarray_ArrayList;

import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
                olusturacagimiz tek katli bir array’e bu toplamlari atayin.
                input : int[][] arr = {{3,4,5}, {2,3,6,7}};
                output: [5, 7, 11]
         */
        int[][] arr = {{3,4,5}, {2,3,6,7}};
        int enKucukArray=arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length<enKucukArray){
                enKucukArray=arr[i].length;
            }
        }
        System.out.println(enKucukArray);
        int[] toplamlarArrayi=new int[enKucukArray];

        for (int i = 0; i < enKucukArray; i++) {
            toplamlarArrayi[i]=arr[0][i]+arr[1][i];
        }
        System.out.println(Arrays.toString(toplamlarArrayi));


    }
}
