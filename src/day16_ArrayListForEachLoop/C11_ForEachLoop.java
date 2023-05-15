package day16_ArrayListForEachLoop;

public class C11_ForEachLoop {
    public static void main(String[] args) {
        /*

        bir array icindeki sayilardan 5'ten buyuk olanlari toplayalim.

        */
        int[] arr ={1,0,2,4,6,4,2,5,1,0,8,9,3,2,4,1,7,2,6,5};
        int toplam =0;
        for (int each:arr
             ) {
            if (each>5){
                toplam+=each;
            }
        }

        System.out.println("Arrayda 5'ten buyuk sayilarin toplami : "+toplam);
    }
}
