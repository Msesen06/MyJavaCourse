package day19_StaticKeyword_PassbyValue;

import java.util.Arrays;

public class C08_PassByValue {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7};
        //verilen bir arraye 4.element olarak 10 ekleyip o halini yazdiran bir method olusturun

        yeniArray(arr);
        System.out.println("method call'dan sonra arr :" + Arrays.toString(arr));
        /*
        birden fazla eleman bulunduran array list gibi java objelerinde
        java methoda yollarken

         */
    }

    public static void yeniArray(int[] arr) {
        int[] yeniArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            yeniArray[i] = arr[i];
        }
        yeniArray[yeniArray.length - 1] = 10;
        arr = yeniArray;
        System.out.println(Arrays.toString(arr));
    }
}
