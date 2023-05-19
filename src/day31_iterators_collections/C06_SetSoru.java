package day31_iterators_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_SetSoru {
    public static void main(String[] args) {
        //verilen bir arrayden tekrar eden elementleri silip unique elementlerden olusan
        //halini arraye kaydedin
        Integer[] sayilar ={1,2,3,2,1,4,5,5,6,7,6,8,8,2,4,2,1,0,8,3};
        //set dublicationa izin vermedigi icin set olusturalım
        Set<Integer> sayilarSeti =new HashSet<>();
        for (Integer each:sayilar
             ) {
            sayilarSeti.add(each);
        }
        System.out.println(sayilarSeti);//[0, 1, 2, 3, 4, 5, 6, 7, 8]

        //arrayi bu elementlerle guncelleyelim
        sayilar =new Integer[sayilarSeti.size()];

        int index =0;
        for (Integer each:sayilarSeti
             ) {
            sayilar[index]=each;
            index++;
        }
        System.out.println("Arrayin son hali :"+ Arrays.toString(sayilar));

    }
}
