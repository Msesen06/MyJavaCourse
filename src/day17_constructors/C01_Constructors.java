package day17_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Constructors {
    String str ="Constructor";
    int sayi =10;
    static boolean isHappy =true;


    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        List<String>                             isimler =      new ArrayList<>();
        //olusturmak istedgimiz objenin turu     obje ismi      keyword   Constructor

        //Constructor bir classtan obje olusturmak icin kullandigimiz ozel bir java yapisidir.
        //constructor methoda benzer ama method degil constructor dir.



    }

    public static void staticMethod(){
        System.out.println("C01 static method calisti");

    }

    public void staticOlmayanMethod(){

        System.out.println("C01 static olmayan method calisti");
    }


}
