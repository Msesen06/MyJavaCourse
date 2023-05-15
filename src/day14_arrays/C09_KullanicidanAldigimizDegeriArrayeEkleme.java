package day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanAldigimizDegeriArrayeEkleme {
    public static void main(String[] args) {
        /*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
                eski array’e yeni degeri atayin
         */
        int[] arr ={3,5,7};

        int[] yeniArray =ArrayaElemanEkle(arr);
        System.out.println("arraye eleman eklenmis hali :"+Arrays.toString(yeniArray));


    }
    public static int[] ArrayaElemanEkle(int[] arr){
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen eklemek isteginiz elemanı girin");
       int eleman = scanner.nextInt();
        int[] yeniArray =new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniArray[i]=arr[i];
        }
        yeniArray[yeniArray.length-1]=eleman;
        return yeniArray;

    }
}
