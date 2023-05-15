package day22_StringBuilder_accessModifier;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {
        StringBuilder sb1 =new StringBuilder("Java candir");
        sb1.append(".");
        System.out.println(sb1);
        String str ="Bu gun hava cok guzel";
        sb1.append(str,5,10);
        System.out.println(sb1);

        sb1.replace(0,4,"Selenium");
        System.out.println(sb1);
        sb1.insert(9,"Heye");
        System.out.println(sb1);
        sb1.insert(0,str,0,3);
        System.out.println(sb1); //Bu Selenium Heyecandir.n havc
        sb1.delete(23,sb1.length());
        System.out.println(sb1);//Bu Selenium Heyecandir.
        int indexC =sb1.indexOf("c");
        sb1.deleteCharAt(indexC);
        System.out.println(sb1);//Bu Selenium Heyeandir.
        sb1.insert(indexC,"c");
        System.out.println(sb1);//Bu Selenium Heyecandir.
        sb1.reverse();
        System.out.println(sb1);//.ridnaceyeH muineleS uB
        sb1.reverse();
        StringBuilder sb2 =new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb2));//-8 harflerin arasındaki farkı verir.
        // iki metnin kaslıastırmasını yapar. birebir aynıysa sıfır verir
        StringBuilder sb3 =new StringBuilder("Bu Selenium Heyecandir.");
        System.out.println(sb1.equals(sb3));//false
        System.out.println(sb1.compareTo(sb3));//0
        // === operatoru ve equals methodu ikisi de false verir
        // Sb de karsılastırma icin compare kullanılır.

        String str1 ="Bu Selenium Heyecandir.";
        System.out.println(sb1.equals(str1));//false


    }
}
