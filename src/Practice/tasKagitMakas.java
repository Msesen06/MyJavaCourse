package Practice;

import java.util.Random;
import java.util.Scanner;

public class tasKagitMakas {
    public static void main(String[] args) {
        /*
         2. Sorumuz:
        // Bilgisayara karsi tas kagit makas oyunu oynayacağımız kodları yazınız
        // Kural: 5 puana ilk ulasan oyunu kazanir

         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userChoice = 0;
        int compChoice = 0;
        int userPoint = 0;
        int comPoint = 0;
        do {
            System.out.println("lutfen seciminizi yapın\n1-taş \n2-kagıt \n3-Makas");
            //kullanici icin bir sayı alacaz
            userChoice = scanner.nextInt();

            //bilgisayar icin bir deger uretelim
            compChoice = random.nextInt(3) + 1; // 0 dahil 3 dhail degil

            if (userChoice == 1 && compChoice == 2) {
                System.out.println("bilgisayarın sectigi :" + compChoice);
                System.out.println("");
                System.out.println("kagıt tası sarar kazanan bilgisayar");
                comPoint++;
                System.out.println("sizin puanınız :" + userPoint + "\nbilgisayarın puanı :" + comPoint);
                System.out.println("");

            } else if (userChoice == 1 && compChoice == 3) {
                System.out.println("bilgisayarın sectigi :" + compChoice);
                System.out.println("");
                System.out.println("tas makası kırar kazanan siz");
                userPoint++;
                System.out.println("sizin puanınız :" + userPoint + "\nbilgisayarın puanı :" + comPoint);
                System.out.println("");

            } else if (userChoice == 2 && compChoice == 1) {
                System.out.println("bilgisayarın sectigi :" + compChoice);
                System.out.println("");
                System.out.println("kagıt tası sarar kazanan siz");
                userPoint++;
                System.out.println("sizin puanınız :" + userPoint + "\nbilgisayarın puanı :" + comPoint);
                System.out.println("");
            } else if (userChoice == 2 && compChoice == 3) {
                System.out.println("bilgisayarın sectigi :" + compChoice);
                System.out.println("");
                System.out.println("makas kagıdı keser kazanan bilgisayar");
                comPoint++;
                System.out.println("sizin puanınız :" + userPoint + "\nbilgisayarın puanı :" + comPoint);
                System.out.println("");
            } else if (userChoice == 3 && compChoice == 1) {
                System.out.println("bilgisayarın sectigi :" + compChoice);
                System.out.println("");
                System.out.println("tas makası kırar sarar kazanan bilgisayar");
                comPoint++;
                System.out.println("sizin puanınız :" + userPoint + "\nbilgisayarın puanı :" + comPoint);
                System.out.println("");
            } else if (userChoice == 3 && compChoice == 2) {
                System.out.println("bilgisayarın sectigi :" + compChoice);
                System.out.println("");
                System.out.println("makas kagıdı keser kazanan siz");
                userPoint++;
                System.out.println("sizin puanınız :" + userPoint + "\nbilgisayarın puanı :" + comPoint);
                System.out.println("");
            } else {
                System.out.println("bilgisayarla aynı seyi sectiniz kazanan yok");
                System.out.println("sizin puanınız :" + userPoint + "\nbilgisayarın puanı :" + comPoint);
            }
        } while (userPoint != 5 && comPoint != 5);

        if (userPoint > comPoint) {
            System.out.println("tebrikler siz kazandınız");
        } else {
            System.out.println("gecmis olsun bilgisayar kazandı");
        }

        System.out.println("oyun bitti");

    }
}
