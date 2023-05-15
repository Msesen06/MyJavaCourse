package day28_Interfaceler;

public interface I01_interface {
    public static void main(String[] args) {
        // interface de abstract yazmzya gerek yoktur
        // methodlar da oyle
        //child classlar icin bir sablondur
        //to do list yapılacaklar listesi

        /*
        bir class implement ettigi  interface lerde aynı adda ve farklı rerurn type ı olan methodlar varsa
        ikisini de implement edemez.

        interfacelerde olsuturuluan variablelar public static final dır.
        yani heryerden ulasılabilir ve degistirilemez.
        eger child classın implement ettigi  interfacelerde aynı isimde variablelar varsa
        static yontem kullanılır. classIsmi.variableIsmi
         */

    }
    int SAYI =20;
    void method1();
    abstract int method2();
    public String method3();
}
