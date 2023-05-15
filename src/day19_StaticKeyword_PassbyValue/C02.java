package day19_StaticKeyword_PassbyValue;

public class C02 {
    static String staticV="Java";
    String isimIns="Sevda";

    public static void main(String[] args) {
        C02 obj1 =new C02();
        System.out.println(obj1.isimIns);
        System.out.println(obj1.staticV);
        obj1.isimIns="Akif";
        System.out.println(obj1.isimIns);
        C02 obj2 =new C02();
        obj2.isimIns ="Ali";
        obj2.staticV="Hava";
        System.out.println(obj2.isimIns+" "+obj2.staticV);
        System.out.println(obj1.staticV);
        System.out.println(staticV);// Hava


    }

}
