package Practice;

import java.util.Scanner;

public class C03_3MayisTeamCalismasi {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");

        String girilen=scanner.nextLine();
        String yeniMetin =girilen.replaceAll("[aeouAEOU]","");
        System.out.println(yeniMetin);
    }
}
