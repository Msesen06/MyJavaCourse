package day19_StaticKeyword_PassbyValue;

public class C01_Static {
    static String staticV ="Java Candir";
    String instanceV ="Selenium heyecandir";

    public static void main(String[] args) {
        staticV="java hayattir";
        StaticMethod();

    }


    public static void StaticMethod(){
        System.out.println("statik method calisti");
        System.out.println(staticV);
    }
    public void staticOlmayanMethod(){
        System.out.println("static olmayan method calisti");
        System.out.println(staticV);
        StaticMethod();
        System.out.println(instanceV);

    }

}
