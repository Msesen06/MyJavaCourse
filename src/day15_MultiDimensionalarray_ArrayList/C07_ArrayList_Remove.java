package day15_MultiDimensionalarray_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList_Remove {
    public static void main(String[] args) {
        String[] harfler ={"a","b","d","f","e","r","s","w","r"};
        List<String> harfList =new ArrayList<>();
        for (int i = 0; i < harfler.length; i++) {
            harfList.add(harfler[i]);
        }
        System.out.println(harfList.remove("t"));
        System.out.println(harfList.remove(8));
        //remove methodunda string verirsek boolean dondurur eger eleman varsa siler ve true doner
        //yoksa false doner, index verilirse o elemanı siler, yoksa exeption verir


    }
}
