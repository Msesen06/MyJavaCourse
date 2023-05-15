package day10_NestedForLoop_MethodOlusturma;
public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen sayi icin asagidaki sekli olusturun
         orn:
         int sayi=4; icin

         1
         1 2
         1 2 3
         1 2 3 4


         */
        int sayi=5;
        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }

}
