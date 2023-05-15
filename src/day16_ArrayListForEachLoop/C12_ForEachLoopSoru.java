package day16_ArrayListForEachLoop;

import java.util.List;
import java.util.Scanner;

public class C12_ForEachLoopSoru {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
                kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle yazın :");
        String cumle= scanner.nextLine();
        System.out.println("lutfen bir harf girin");
        String harf = scanner.next();
        int sayac =0;
        String[] harflerListesi =cumle.split("");
        for (String each:harflerListesi
             ) {
            if (each.equalsIgnoreCase(harf)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println(harf +" harfi cumlede hic kullanilmamis");
        } else {
            System.out.println(harf+" harfi cumlede "+sayac+" kez kullanilmis");
        }



    }
}
