package day28_Interfaceler;

public interface I03_BodyOlanMethod {
    /*
    intefacedeki tum methodlar public ve abstract tir.
    yazılmasa da..

    Java kendisine gelen talepler dogrultusunda
    interface e eklenen methodları child classların implement etme zorunlulugunu
    olmamasını saglamıstır.

    method deklarasyonuna default veya static keyword eklenirse
    methodun body si olabilir ve implement etme zorunlulugu da kalmaz.
    burada kullanılan default keyword public access modifierdan sonra kullanılır.
    bu 5.kullanımı

    aynı sekilde static keyworde kısmen farklı bir kullanıma sahip
     child classtan static olarak olsuturdugumuz method6 ya direk ulasamıyoruz
     static yolla ulasabilriz.
     InterfaceAdi.methodAdi

     */
    public abstract void method1();
   int method2();
    String method3();
    double method4();
    public default void method5(){

    }
    public static int method6(){
        return 5;
    }

}
