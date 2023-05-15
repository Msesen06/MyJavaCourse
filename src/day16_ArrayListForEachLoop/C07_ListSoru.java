package day16_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_ListSoru {
    public static void main(String[] args) {
        /*Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
                  elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun

         */

        int[] arr ={1,3,4,3,6,5,4,3,2,1,2,7,2,5,8,4};

        System.out.println(tekrarsizList(arr));

        System.out.println(tekrarsizList(arr).subList(0, 3));

    }

    public static List<Integer> tekrarsizList(int[] arr){
        List<Integer> sayiList =new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!sayiList.contains(arr[i])){
                sayiList.add(arr[i]);
            }
        }

        return sayiList;

    }
}
