package Alistirmalar;

import java.util.Scanner;

public class krediKartBilgisi {
    public static void main(String[] args) {
        /*
         * Ask user Name, Surname and credit card numbers than convert it to special
         * form
         *
         * (Check credit card number, if there aren’t 16 digit print
         * “Invalid credit card number”
         *
         * Input : John White 1234234534561478
         * Output : Name : J** W*
         *          CCN  : ** ** ** 1478
         *  (Initials for name and surname should be uppercase)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isiminizi giriniz");
        String isim = scanner.nextLine().toUpperCase();
        System.out.println("Lutfen Soyİsminizi giriniz");
        String soyisim = scanner.nextLine().toUpperCase();
        String kartNo = "";
        do {
            System.out.println("Lutfen kart numaranizi giriniz");
            kartNo = scanner.nextLine();
            if (kartNo.length() == 16) {
                break;
            } else System.out.println("Invalid credit card number");
        } while (kartNo.length() != 16);


           /*
                 System.out.println("Name :" + isim.toUpperCase().charAt(0) + isim.substring(1).replaceAll("\\w", "*") +
                " " + soyisim.toUpperCase().charAt(0) + soyisim.substring(1).replaceAll("\\w", "*") +
                "\nCCN  : " + "** " + "** " + "** " + kartNo.substring(kartNo.length() - 4));

            */
        System.out.println("Name :" + isim.toUpperCase().charAt(0) +"**"+
                                " " + soyisim.toUpperCase().charAt(0) +"**" +
                         "\nCCN  : " + "** " + "** " + "** " + kartNo.substring(kartNo.length() - 4));

    }
}
