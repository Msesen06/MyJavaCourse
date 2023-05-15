package day16_ArrayListForEachLoop;

public class C09_ForEachLoop {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
                yazdiran bir method olusturun.
         */
        int[] arr={2,4,6,7,1};
        arrayKarelerToplami(arr);

    }
    public static void arrayKarelerToplami(int[] arr){
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println(toplam);

    }
}
