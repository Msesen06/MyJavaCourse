package day13_arrays;

public class C03_ArrayinTumElementleriniToplama {
    public static void main(String[] args) {

        /*
        Soru:
        -Verilen bir array'in tum elemenlerini toplayip yazdiran bir method olusturun

        */

        int[] arr ={1,2,5,7,8,3,4};

        elementler_Toplam(arr);;

    }

    public static void elementler_Toplam(int[] arr1) {
        int toplam =0;
        for (int i = 0; i < arr1.length; i++) {
            toplam+=arr1[i];
        }
        System.out.println("Arraydeki elemenlerin toplami :"+toplam);
    }
}
