package Alistirmalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class adamAsmacaOyunu {
    public static void main(String[] args) {
        String[] kelimeler ={"java","kodlama","css","programlama","değişken","html","javascript"};
        String secilenKelime=kelimeler[(int) (Math.random()* kelimeler.length)];
        //System.out.println(secilenKelime);

        char[] harfler =new char[secilenKelime.length()];

        for (int i = 0; i < harfler.length; i++) {
            harfler[i]='_';
        }
        System.out.print(harfler);
        System.out.println("");
        Scanner scanner=new Scanner(System.in);
        int can =5;
        boolean kelimeDogrumu =false;
        while (!kelimeDogrumu && can >0) {
            System.out.println(harfler);
            System.out.println("kalan hakkınız :"+can);
            System.out.println("lutfen bir harf veya kelime giriniz :");
            String alinan =scanner.next().toLowerCase();
            boolean dogruMU =false;
            if (alinan.length()==1){
                for (int i = 0; i < harfler.length; i++) {

                    if (secilenKelime.charAt(i)==(alinan.charAt(0))){
                        harfler[i]=alinan.charAt(0);
                        dogruMU =true;
                    }
                }
                if (!dogruMU){
                    System.out.println(alinan+" tahmin yanlış");
                    can--;
                }

            } else {
                System.out.println("lutfen sadece bir harf girin");
            }

            if (secilenKelime.equals(String.valueOf(harfler))){
                kelimeDogrumu=true;
                System.out.println("tebrikler bildiniz :" + secilenKelime);
            }

        }

        if (!kelimeDogrumu || can==0){
            System.out.println("Bilemediniz kelime :" +secilenKelime);
        }

    }
}
