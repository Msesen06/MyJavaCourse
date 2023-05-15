package day20_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClasses {
    public static void main(String[] args) {
        String str ="Java candir";
        System.out.println(str.toUpperCase());//JAVA CANDİRi
        str.toLowerCase();
        str.replace("a","e");
        str.repeat(4);
        System.out.println(str);//Java candir

        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(3);
        sayilar.add(6);
        sayilar.add(7);
        System.out.println(sayilar);//[3, 6, 7]
        sayilar.set(0,10);
        System.out.println(sayilar);//[10, 6, 7]


        /*
        String ve wrapper classlar immutable dir
        yani degistirilemez
         */
    }
}
