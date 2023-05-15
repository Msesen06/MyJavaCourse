package day17_constructors;

public class C02_ConstructorRunner {
    public static void main(String[] args) {
        // C01 classindaki variable ve methodlara ulasmak istersek


        C01_Constructors.staticMethod();
        System.out.println(C01_Constructors.isHappy);

        // static olmayan method ve variable'lara erismek icin
        // o classtan obje olusturmamiz lazim (constructor)

        C01_Constructors obje =new C01_Constructors();
        // hem class adi hem de obje turudur.
        // new yeni obje olusturmak icin keyword
        // C01_Constructors()  constructor
        /*
        bir objenin olusturulmasi ve  ilk deger atamasinin
        (initialize) yapilmasi icin mutlaka constructor
        calismalidir.

        Java bir class olusturuldugunda o classtan obje
        olusturulabilmesi icin her classa otomatik olarak default
        bir constructor yerlestirir
        bunlar gorunmez..


         */
        System.out.println(obje.str);
        obje.staticOlmayanMethod();
        obje.sayi=25;


    }
}
