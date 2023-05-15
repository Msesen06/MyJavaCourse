package day23_encapsulation_inheritance;

public class C07_ChildClass extends C06_parent{
    /*
    java classlar parent edinir
    eger bir classtaki tumozellikleri kullanmak istersek
    miras almak isterse
    extends keywordu ile parent edinebilir
    baska bir classtan obje olusturarak o class uyelerini kullanmak
    inheritance degildir.

    parent classtaki
    -private class uyeleri inherit edilemez
    -default class uyeleri ayni package icinde ise edilebilir.
    -protected class uyeleri heryerden edilebilir.
    -public heryerden




     */
    public static void main(String[] args) {
        C06_parent obj =new C06_parent();
        System.out.println(obj.publicStr);

        C07_ChildClass obj1 =new C07_ChildClass();
        System.out.println(obj1.defaultStr);
        obj1.protectedMethod();//parent class protected method
        obj1.publicMethod();//child class public method

    }
    public void publicMethod(){
        System.out.println("child class public method");
    }
}
