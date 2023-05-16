package day30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_MultipleExceptions {
    public static void main(String[] args)  {
        try {
            FileInputStream fis =new FileInputStream("src/day29_Exceptions/deneme.txt");

            int k =0;
            while ((k= fis.read() ) != (-1)) {
                System.out.println((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu hatalı dosyaya erisilemedi");
        } catch (IOException e) {
            System.out.println("Dosyaya erisim ve okuma ile ilgili bir hata var");
        }

        /*
        eger parent child iliskisi olan birden fazla exception turunu try catch ile handle etmek istersek
            1- icice iki try catch blogu ile yapabiliriz
            2-eger bir try ve birden fazla catch blogu olusturacaksak once child blogunu
            yapmalıyız. cunku parent genel kapsmalıdır.
            3- child exception icin catch yazmadan sadece parent icin bir tane catch yazabiliriz.
         */
    }
}
