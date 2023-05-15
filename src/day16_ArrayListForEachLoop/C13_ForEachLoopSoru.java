package day16_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C13_ForEachLoopSoru {
    public static void main(String[] args) {
        int[] arr ={1,0,2,4,6,4,2,5,1,0,8,9,3,2,4,1,7,2,6,5};

        //verilen arrayda once cift sayilari sonra tek sayilari farkli list'e ekleyip yazdiran bir
        //method olusturun

    tekVeCiftSayilariAyriListeyeEkle(arr);


    }
    public static void tekVeCiftSayilariAyriListeyeEkle(int[] arr){
        List<Integer> ciftSayilar =new ArrayList<>();
        List<Integer> tekSayilar =new ArrayList<>();
        for (int each:arr
        ) {
            if (each%2==0){
                ciftSayilar.add(each);
            }
            else {
                tekSayilar.add(each);
            }

        }
        System.out.println("cift sayilar :"+ciftSayilar);
        System.out.println("tek sayilar :"+tekSayilar);


    }

}
