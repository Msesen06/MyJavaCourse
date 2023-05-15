package day15_MultiDimensionalarray_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C11_equals {
    public static void main(String[] args) {
        List<String> isimler1 =new ArrayList<>();
        isimler1.add("Selgun");
        isimler1.add("Sevda");
        isimler1.add("Saida");
        List<String> isimler2 =new ArrayList<>();
        isimler2.add("Sevda");
        isimler2.add("Selgun");
        isimler2.add("Saida");
        System.out.println(isimler1);
        System.out.println(isimler2);
        System.out.println(isimler1.equals(isimler2)); //false
        //array list bir Collections oldugu icin sort methodu oradan kullanilir

        Collections.sort(isimler1);
        Collections.sort(isimler2);
        System.out.println(isimler1.equals(isimler2));
    }
}
