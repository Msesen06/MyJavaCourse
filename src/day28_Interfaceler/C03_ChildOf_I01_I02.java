package day28_Interfaceler;

import day27_pollymorphism_abstractClasslar.C04_Toyota;

public class C03_ChildOf_I01_I02 extends C04_Toyota implements I01_interface,I02_interface {
    public static void main(String[] args) {

        System.out.println(I01_interface.SAYI);
        System.out.println(I02_interface.SAYI);

        System.out.println(DERS);

    }
    @Override
    public void method1() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method6() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
