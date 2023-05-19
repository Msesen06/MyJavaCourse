package Practice;

public class UcgenOlusturma {
    public static void main(String[] args) {
        //verilen bir sekil veya harf ile bir ucgen olusturun Orn: *, #

        for (int i = 1; i < 10; i++) {
            for (int j = i; j<10; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }


    }
}
