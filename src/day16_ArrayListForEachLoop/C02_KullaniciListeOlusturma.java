package day16_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_KullaniciListeOlusturma {
    public static void main(String[] args) {
        // Kullanicidan alinan isimleri bir listeye ekleyen bir method olusturun

        List<String> isimler =ListeOlustur();
        System.out.println(isimler);

    }

    public static List<String> ListeOlustur(){
        List<String> isimler =new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String eklenecek="";
        while (!eklenecek.equalsIgnoreCase("f")){
            System.out.println("lütfen listeye eklemek icin isimler giriniz" +
                    "\nbitirmek f'ye basiniz");
            eklenecek = scanner.next();
             if (!eklenecek.equalsIgnoreCase("f"))
             {
                 isimler.add(eklenecek);
             }



        }

        return isimler;
    }
}
