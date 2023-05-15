package day13_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] arr1 ={"Ayten","Sevda","Adem"};
        // array'i yazdirmak istersek Arrays classindan toString methodunu kullanmamiz gerekir
        //java direkt sout ile yazdirmaz
        // koseli bir parantez icinde bir virgul ve bir bosluk bırakır.
        System.out.println(Arrays.toString(arr1));

        // arrayin uzunluguna ulasmak istersek lengti kullanmaliyiz
        System.out.println(arr1.length);
        System.out.println(arr1[0].length());

        int[] arr2 =new int[6];
        System.out.println(Arrays.toString(arr2));
        arr2[1]=2;
        arr2[3]=4;
        arr2[5]=6;
        System.out.println(Arrays.toString(arr2));


    }
}
