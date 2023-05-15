package day19_StaticKeyword_PassbyValue;

import java.util.Arrays;

public class C07_PassByValue {
    public static void main(String[] args) {
        int[] arr ={10,12,23};
        //verilen arrayin elemanlarini 3 arttirip yazdiran bir method yazin

        ElemenlariArtir(arr);
        System.out.println("method call dan sonra " +Arrays.toString(arr));
    }
    public static void ElemenlariArtir(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=3;
        }
        System.out.println(Arrays.toString(arr));

    }
}
