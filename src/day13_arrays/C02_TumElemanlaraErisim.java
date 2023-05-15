package day13_arrays;

public class C02_TumElemanlaraErisim {
    public static void main(String[] args) {

        /*
        arrayi yazdirmak ile elementlerini yazdirmak farklidir
        arrayi yazdirmak istersek Arrays.toString methodunu,
        elementlerini yazdirmak istersek for loop kullaniriz

         */

        int[] arr1 ={2,4,6,8,1,3,8,5};

        for (int i = 0; i < arr1.length-1; i++) {
            System.out.print(arr1[i]+"-");
        }
        System.out.print(arr1[arr1.length-1]);

    }
}
