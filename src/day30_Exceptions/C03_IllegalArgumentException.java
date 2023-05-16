package day30_Exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        // kullanicidan yasını alıp
        //65 ten buyukse olabilecegini yazdırın
        //eger 20 den kucuk bir yas girerse exception fırlatsın o kodları atlasın

        Scanner scanner =new Scanner(System.in);
        System.out.println("lutfen yasınızı giriniz :");
        int yas = scanner.nextInt();

        try {
            if (yas<20){
               throw new IllegalArgumentException("yas 20 den kucuk olamaz.");
            } else if (yas<65) {
                System.out.println("emekli olmanıza "+(65-yas) +" yıl var");
            } else {
                System.out.println("emekli olabilirsiniz");
            }

            System.out.println("emekli islemleri");
            System.out.println("emekli islemleri");
            System.out.println("emekli islemleri");
            System.out.println("emekli islemleri");
            System.out.println("emekli islemleri");
        } catch ( IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
