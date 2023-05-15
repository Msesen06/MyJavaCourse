package day16_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturmaYazdirma {
    public static void main(String[] args) {
       List<String> isimler =new ArrayList<>();
       isimler.add("Ahmet");
        isimler.add("Mahmut");
        isimler.add("Murat");
        isimler.add("Sefa");
        isimler.add("Erhan");
        ListYazdir(isimler);

    }
    public static void ListYazdir(List<String> isimler){

        System.out.println(isimler);

    }
}
