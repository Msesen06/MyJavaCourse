package Practice;

import java.util.Arrays;

public class c06_array {
    public static void main(String[] args) {
        // Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        // olusturun. Eski array’i yeni haliyle kaydedin.
        int[] dizi ={2,4,3,8,1,12,15};
        System.out.println(Arrays.toString(dizi));
        System.out.println(Arrays.toString(elemaniArtir(dizi)));


    }
    public static int[] elemaniArtir(int[] dizi){
        int eklenecek =4;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=dizi[i]+eklenecek;
        }

        return  dizi;

    }

}
