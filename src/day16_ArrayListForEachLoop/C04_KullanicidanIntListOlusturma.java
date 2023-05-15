package day16_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanicidanIntListOlusturma  {
    public static void main(String[] args) {
        //Kullanicidan alinan sayilarla bir integer list donduren bir method olusturun
        List<Integer> sayilar =IntListOlustur();
        System.out.println(sayilar);

    }

    public static List<Integer> IntListOlustur(){
        Scanner scanner=new Scanner(System.in);
        List<Integer> sayilar =new ArrayList<>();
        int girilen =1;

        while (girilen!=0){
            System.out.println("lutfen listeye eleman eklemek icin sayi giriniz" +
                    "\nbitirmek 0'e basın");
            girilen= scanner.nextInt();
            if (girilen!=0){
                sayilar.add(girilen);
            }
        }
        return sayilar;
    }
}
