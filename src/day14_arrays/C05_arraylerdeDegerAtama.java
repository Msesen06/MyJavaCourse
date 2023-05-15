package day14_arrays;

import java.util.Arrays;

public class C05_arraylerdeDegerAtama {
    public static void main(String[] args) {
        String str ="Ahmet";
        str ="mehmet";
        String[] arr ={"ahmet","mehmet"};
        //arr={"ahmet","mahmut"}; cte verir cunku arrayde yeniden deger ataması yapılamaz

        arr =new String[4];// yeni bir array olusturup eskisini siler
        arr =new String[] {"a","b"}; //yeni bir array olusturup deger atamasi yapilabilir
                                    //  veya  bos birakilabilir

        String[] arr1={"ahmet","ali"};
        String[] arr2={"a","b","c"};
        arr1 =arr;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));

        arr1=new String[5];
        arr1[0]="ali";
        arr1[1]="ahmet";
        //arr1[2]="veli"; null verir
        arr1[3]="mahmut";
        System.out.println(Arrays.toString(arr1));

    }
}
