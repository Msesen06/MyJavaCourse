package day13_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class C08_ArraydaElemanArama {
    public static void main(String[] args) {
        /*Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
                  kullanildigini yazdiran bir method olusturun

         */

        String[] arr ={"Saida","Isa","Asil","Kubra1","Elif","isa"};


        elemanArama(arr,"kubra");

    }

    public static void elemanArama(String[] arr, String aranan) {
        int sayac=0;
        boolean varMi =false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(aranan)){
                varMi=true;
                sayac++;
            }
        }
        if (varMi){
            System.out.println("aradiginiz kelime arrayde vardir ve "+sayac+" kez kullanilmistir");
        }
        else {
            System.out.println("Aradiginiz kelime arrayde yoktur");
        }

    }
}
