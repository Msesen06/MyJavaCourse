package day10_NestedForLoop_MethodOlusturma;

public class C05_NestedForLopp {
    public static void main(String[] args) {
        int sayi=5;
        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 1; i <sayi ; i++) {
            for (int j = sayi; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }





    }
}
