package day09_StringManipulation_ForLoop;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        // Soru
        // Kullaınıcdan bir cümle alın eger icinde "ev" varsa home home sweet home yazdırın
        //is geciyorsa calısmak güzeldir
        // ikise de geciyorsa hem ev hem iş lazım
        // ikisi de yoksa cok calısman lazım

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir cümle yazın :");
        String cumle =scanner.nextLine().toLowerCase();

        if (cumle.contains("ev")&&cumle.contains("is")){
            System.out.println("hem ev hem is lazım");
        } else if (cumle.contains("is")) {
            System.out.println("calısmak güzeldir");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else {
            System.out.println("cok calısman lazım");
        }

        //soru
        //

    }
}
