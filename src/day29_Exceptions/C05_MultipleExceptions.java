package day29_Exceptions;

import java.util.Scanner;

public class C05_MultipleExceptions {
    /*
    eger birden fazla exception olusma ihtimali varsa ve bu exception arasında
    parent child iliskisi yoksa 3 farklı yaklasım kullanabiliriz.
        1- iki farklı exception ihtimali icin iki farklı try catch olusturabiliriz
        2- bir try iki catch
        3-2 exceptionu kapsayan bir exception
     */


    public static void main(String[] args) {
        //elimizde input olarak verilmis bir string ve sayılardan olusan bir array var.

        String str ="Java her seyi dusunmus.";
        int[] sayilar ={2,4,6,7,8,9,1,2,3,4,3,7,4};
        //kullanıcıdan 0 veya pozitif bir tamsayı isteyin
        //verilen sayıyı index olarak kullanıp
        //String ve arrayden o indexteki harf ve sayıyı yazdırın.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen index olarak bir tamsayı girin :");

        int index = scanner.nextInt();


            // 1.yontem

        /*
        System.out.println("istenen indexteki degerler :" );

        try {
            System.out.print(str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("verilen index strinde yok");
        }

        try {
            System.out.print(sayilar[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("verilen index arrayde yok");
        }

         */
        //2.yontem if else if gibi
        /*
        try {
            System.out.println("istenen indexteki degerler :"+str.charAt(index)+sayilar[index]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index strinde yok");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("verilen index arrayde yok");
        }

         */

        //3.yontem
        try {
            System.out.println("istenen indexteki degerler :"+str.charAt(index)+sayilar[index]);
        } catch (RuntimeException e) {
            System.out.println("index sınırların dısında yok");
        }


    }
}
