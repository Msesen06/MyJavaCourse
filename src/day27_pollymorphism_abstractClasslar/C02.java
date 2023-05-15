package day27_pollymorphism_abstractClasslar;

import java.util.ArrayList;

public class C02 extends C01_OverridingReturnType{
    //child

   void method1(){

    }
    double method2(){

       //return type void veya primitive data turu ise
        //overriden method ile overriding methodun
        // return type ları aynı olmalı

        /*
        return type non-primitive ise child classın return
        type ı parent classın overriden methodun return
        type ının aynısı veya child classı olmalı

        covariant
         */
       return 3;
    }
    String method3(){
       return "Selenium heyecandır";
    }
    Double method4(){
       return  5.3;
    }
    ArrayList<String> method5(){
       return new ArrayList<>();
    }
}
