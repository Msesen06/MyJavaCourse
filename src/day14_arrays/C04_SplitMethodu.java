package day14_arrays;

import java.util.Arrays;

public class C04_SplitMethodu {
    public static void main(String[] args) {

        //kac tane e harfi  oldugunu donduren bir method olusturun
        String str ="Java gErcekten cok guzel";
        String aranan ="f";
        splitMethodu(str,aranan);



    }

    public static int splitMethodu(String str,String aranan) {
        str =str.replace(" ","");
        String[] harfler= str.split("");
        int sayac=0;
        for (int i = 0; i < harfler.length; i++) {
            if (harfler[i].equalsIgnoreCase(aranan)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println(aranan+" yok");
        }
        else {
            System.out.println("metinde "+sayac+" tane "+aranan +" vardir.");
        }
        return sayac;
    }

}
