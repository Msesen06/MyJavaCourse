package day28_Interfaceler;

import day27_pollymorphism_abstractClasslar.C07_AbstractP;

public class C01_ConcreteChildClass extends C07_AbstractP {
    /*
    Abstract claslardan sonra gelen ilk conrete class parent clasalrdaki  tum abstract meethodları implemenet etmek
    zorundadır digerleri zorunlu degildir.
     */
    @Override
    protected void method2() {
        System.out.println("first concrete child class method2");
    }

    @Override
    protected void method5() {
        System.out.println("first concrete child class method5");

    }
}
