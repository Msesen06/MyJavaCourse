package day29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C07_CheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        IoException ınput outpot
        javada dosya okuma ve yazma ile ilgili exceptionlar
        compile time da devreye girip bizi uyarır.
        java ile bir dosyaya erismek istersek dosya yoluna ihtiyac olur
        src/day29_Exceptions/deneme.txt

        FileInputStream classından olusturacgımız obje ile istedgimiz dosyaya ulasabiliriz.

        ancak java o konumda dosyanın var oldgundan emin  olmak ister
        o yuzden altını cizer
        iki yolla duzeltilebilir
        1- try catch ile exception handle edilebilir
        2- dosya yolu dogru hata olusursa olussun
        throw keyword

         */

        String dosyaYolu ="src/day29_Exceptions/deneme.txt";
        FileInputStream fis =new FileInputStream(dosyaYolu);
    }
}
