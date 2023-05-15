package day19_StaticKeyword_PassbyValue;

public class C03_staticBlok {
    public static void main(String[] args) {
        System.out.println("main method calisti");
    }

    static {
        System.out.println("birinci blok calisti");
    }

    static {
        /*
        static bloklar class calismaya baslar baslamaz devreye girer,
        diger tum kodlardan once hatta main methoddan once calisir


        main method calismadan once ayarlamamiz gereken bazi uyarlamalar
        varsa veya bazi variable'lara baslangic degerini atamak istiyorsak static bloklar
        kullanilabilir.

        birden fazla static blok varsa yukaridan asagiya dogru calisir.
         */
        System.out.println("static blok calisti");
    }
}
