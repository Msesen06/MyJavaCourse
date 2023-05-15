package day12_doWhile_scope;

import java.util.Scanner;

public class C04_DoWhileLoop_TamKare {
    public static void main(String[] args) {
        /* Soru 3-Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
                  bulunuz, tamkare ise true değilse false yazdırınız.
                  Ornek : input : 16, output: 4

         */

        Scanner scanner =new Scanner(System.in);
        boolean tamkareMi=false;
        System.out.println("lütfen pozitif bir tam sayi sayi giriniz:");
        int sayi = scanner.nextInt();
        int basla=1;


        /*  1.yontem

        do {
            if (sayi==basla*basla){
                tamkareMi=true;
                break;
            }
            basla++;
        } while (basla*basla<=sayi);
         System.out.println(tamkareMi);
     */



        // 2.yontem

        while (basla<=sayi){
            if (sayi%basla==0){
                  if (sayi==basla*basla){
                      tamkareMi=true;
                      break;
                  }
            }
            basla++;
        }
        System.out.println(tamkareMi);

    }
}
