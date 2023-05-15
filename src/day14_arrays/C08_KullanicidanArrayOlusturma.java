package day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_KullanicidanArrayOlusturma {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
                donduren bir method olusturun.
        */


        System.out.println("Arrayiniz :"+Arrays.toString(ArrayOlusturma()));


    }

    public static int[] ArrayOlusturma(){
        int uzunluk=0;
        int eleman=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen arrayin uzunlugunu giriniz :");
        uzunluk= scanner.nextInt();
        int[] arr=new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("lütfen dizinin "+i+ ". elemaninini giriniz");
            eleman= scanner.nextInt();
            arr[i]=eleman;
        }

        return arr;



    }

}
