package Alistirmalar;

import java.util.Scanner;

public class stringDegistirme {
    public static void main(String[] args) {
        // tek uzunlugundaki bir stringin tam ortasındaki harfi  degilse ortadaki iki harfi yazdiran bir
        // bir method olusturun
        Scanner scanner =new Scanner(System.in);
        System.out.println("lutfen bir kelime girin");
        stringMethod(scanner.nextLine());

    }

    public static void stringMethod(String girilen){

        if (girilen.length()%2==0){
            System.out.println(girilen.substring(girilen.length()/2-1,(girilen.length()/2)+1));
        } else {
            System.out.println(girilen.charAt((girilen.length()-1)/2));
        }

    }
}
