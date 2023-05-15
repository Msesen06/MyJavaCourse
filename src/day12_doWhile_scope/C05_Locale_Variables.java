package day12_doWhile_scope;

public class C05_Locale_Variables {
    /*
    kural 1- Locale variable'lar sadece kendi scopalarinda gecerlidir.
             bir methodda olusturulan variable'lar sadece o methodda kullanilabilir.

    kural 2- Locale bir scope ta deger atamadan variable olusturulabilir, ancak yazdirilamaz ve
             hazir methodla kullanilamaz.
    kural 3- Bir loop icerisinde olusturulan bir variable sadece orda kullanilabilir.
     */

    public static void main(String[] args) {
        int sayi=10;
        //yeterliMi=false;
       String slogan="Java candir";
        System.out.println(slogan);
        slogan="java hayattir";
        String s;
        //System.out.println(s);

        for (int i = 0; i < 10; i++) {
            int sayi2=10;
            System.out.print(sayi2+i);

        }
        // for loop icerisinde i ve sayi2 adinda 2 variable vardir
        //System.out.println(sayi2);kullanilamiyor
        //i=20;

    }
    public static void staticMethod(){
        String str="java mutluluktur.";
    }
    public void staticolmayanMethod(){
        boolean yeterMi=true;
        //System.out.println(sayi);
    }
}
