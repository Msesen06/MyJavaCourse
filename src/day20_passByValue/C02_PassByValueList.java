package day20_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {
        List<String> harfler =new ArrayList<>();
        harfler.add("A");
        harfler.add("K");
        harfler.add("Z");
        System.out.println(harfler);//[A, K, Z]
        System.out.println("method1 call sonrasi list :"+ method1(harfler));
        System.out.println("method calldan sonra list:"+harfler);


        System.out.println("method 2 calldan donen list :"+method2(harfler));
        System.out.println("method 2 calldan sonra list :"+harfler);
    }
    public static List<String> method1(List<String> harfler){
        harfler.set(0,"T");
        harfler.set(1,"C");
        System.out.println("method1 icinde list :" +harfler);
        return harfler;
    }
    public static List<String> method2(List<String> harfler){
        harfler=new ArrayList<>();
        harfler.add("P");
        System.out.println("method 2 icinde list: "+harfler);
        return harfler;
    }


}
