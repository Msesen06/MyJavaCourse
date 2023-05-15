package day10_NestedForLoop_MethodOlusturma;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen satır ve sütun sayısına uygun olarak asagıdaki sekli yazdırın


        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        */
        for (int i =1; i <5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("=====================================================");
        int satirSayisi =6;
        int sutunSayisi =8;

        for (int i = 0; i <satirSayisi ; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print("*  ");

            }
            System.out.println("");
        }

    }
}
