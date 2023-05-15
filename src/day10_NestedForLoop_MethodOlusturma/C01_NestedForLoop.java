package day10_NestedForLoop_MethodOlusturma;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        /*
        1 Den 4 e kadar olan rakamların carpım tablosunu yapın

        1  2  3  4
        2  4  6  8
        3  6  9  12
        4  8  12  16

         */
        for (int i = 1; i <5; i++) {
            System.out.print(i+"  ");
        }
        System.out.println("");
        for (int i = 1; i <5; i++) {
            System.out.print(2*i+"  ");
        }
        System.out.println("");
        for (int i = 1; i <5; i++) {
            System.out.print(3*i+"  ");
        }
        System.out.println("");
        for (int i = 1; i <5; i++) {
            System.out.print(4*i+"  ");
        }

        System.out.println("\n====================================");
        for (int i = 1; i < 5; i++) {

            for (int j = 1; j < 5; j++) {
                System.out.print(i*j+"  ");
            }
            System.out.println("");
        }




    }
}
