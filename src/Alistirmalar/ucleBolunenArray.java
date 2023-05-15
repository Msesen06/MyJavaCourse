package Alistirmalar;

import java.util.Arrays;

public class ucleBolunenArray {
    public static void main(String[] args) {
        //verilen bir arrayda ucle bolunen elemanlari  yeni bir diziye kopyalayan bir
        //bir method olusturun
        int[] dizi = {2, 6, 9, 11, 13, 18, 24, 44, 51, 66, 93};
        System.out.println(Arrays.toString(ucleBolunenArray(dizi)));

        System.out.println(Arrays.toString(Arrays.copyOf(dizi, 5)));
    }

    public static int[] ucleBolunenArray(int[] dizi) {

        int[] ucleBolunenArray =new int[dizi.length];
        int index =0;
         for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%3==0){
               ucleBolunenArray[index]=dizi[i];
               index++;

            }
        }
        return Arrays.copyOf(ucleBolunenArray,index);
    }
}
