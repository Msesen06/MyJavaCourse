package day08_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C11_replaceAll {
    public static void main(String[] args) {
        String str ="    J7774890*20*=(/&%+^%&/()/&%+^+%&(a75589v9898a    &%$C½$$½$½###$#a$£#£n%+^+^d^i½$$½$½r  ";
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str);
        str=str.trim();
        System.out.println("trim :"+str);
        str=str.replaceAll(" ","5");
        System.out.println("bosluk 5 :"+str);
        str=str.replaceAll("\\d","");
        System.out.println("rakamsız :" +str);
        str =str.replace("5"," ");
        str=str.replaceAll("\\s+","");
        System.out.println(str);
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen isminizi girin :");
        String isim =scanner.nextLine();
        System.out.println(isim.replaceAll("\\d",""));



    }
}
