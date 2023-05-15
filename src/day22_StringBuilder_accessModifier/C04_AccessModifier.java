package day22_StringBuilder_accessModifier;

public class C04_AccessModifier {

    public String marka;
    String model ;
    /*
    eger bir methodda veya class leveldaki variableda bir access modifier yoksa
    default modifier gecerlidir.

    default keyword
    - switch default value
    - class levelda variable icin default
    -default constructor
    - default access modifier

    Access modifier ve static keyword birlikte degerlendirilebilir.
    -class icerisinde dusundugumuzde static keyword bir method icerisinde herhangi bir class
    uyesinin kullanılabilir olup olmadıgını belirler.
    -baska bir classtan kullanımda ise static keyword erisim yontemini belirler
        static variable veya method baska classtan classIsmi.methodIsmi
        static olmayan bir method veya variable kullanmak icin bir obje olusturmalıyız
     */
    public static void main(String[] args) {

    }
    public static void method1(){

    }
    public void method2(){

    }
    void method3(){
        System.out.println("default access modifier");
    }
}
