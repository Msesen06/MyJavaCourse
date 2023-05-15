package day13_arrays;

public class C04_ArraydeIstenenSartlariSaglayanElementleriBulma {
    public static void main(String[] args) {
        /*
        Soru :
        -Verilen arrayde kac tane cift sayılı element vardir
         */



        int[] arr ={1,2,5,7,8,3,4};
        int sayac =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                sayac++;
            }
        }
        System.out.println("verilen arrayda "+sayac+" tane cift sayi vardir");

        // 3'e bolunebilen kac sayı oldugunu yazdirin
        sayac=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%3==0){
                sayac++;
            }
        }
        System.out.println("verilen arrayda "+sayac+" tane 3'e bolunen sayi vardir");
        // verilen arrayde 4 ve 8 (dahil) arasinda kac sayi vardir

        sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (4<=arr[i] && arr[i]<=8) {
                sayac++;
            }
        }
        System.out.println("verilen arrayda "+sayac+" tane 4 ve 8 arasinda sayi vardir");
    }
}
