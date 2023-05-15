package day07_SwitchCase_StringMani;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        //soru 2: kullanıcıdan bir harf alın
        //buyuk kucuk duyarlı olmsın
        // kullanıcı o veya O girdiğinde ocak yazdırsın

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen vir ayın ilk harfini girin");
        char harf =scanner.nextLine().toUpperCase().charAt(0);
        switch (harf){
            case 'O':
                System.out.println("OCAK");
                break;
            case 'Ş':
                System.out.println("ŞUBAT");
                break;
            case 'M':
                System.out.println("MART veya MAYIS");
                break;
            case 'N':
                System.out.println("NİSAN");
                break;
            case 'H':
                System.out.println("HAZİRAN");
                break;
            case 'T':
                System.out.println("TEMMUZ");
                break;
            case 'A':
                System.out.println("AGUSTOS veya ARALIK");
                break;
            case 'E':
                System.out.println("EYLÜL veya EKİM");
                break;
            case 'K':
                System.out.println("KASIM");
                break;
            default:
                System.out.println("GECERSİZ HARF");


        }

    }
}
