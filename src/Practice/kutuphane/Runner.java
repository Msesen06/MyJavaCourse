package Practice.kutuphane;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
        Kutuphane kutuphane =new Kutuphane();
        Kitap kitap1 =new Kitap("Kürk Mantolu Madonna","Sabattin Ali");
        Kitap kitap2 =new Kitap("Suc ve Ceza","Dostoyevski");
        Kitap kitap3 =new Kitap("Mavi ve Siyah","H.Ziya Usakligil");
        Kitap kitap4 =new Kitap("Kırmızı ve Siyah","Stendhal");
        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);
        kutuphane.kitapEkle(kitap3);
        kutuphane.kitapEkle(kitap4);

        for (Kitap kitap: kutuphane.getKitaplar()
             ) {
            System.out.println("Kitap adı :"+kitap.getKitapAdi()+ " ----> Yazarı :"+kitap.getYazar());
        }
    }

}

