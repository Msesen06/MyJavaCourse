package day27_pollymorphism_abstractClasslar;

public abstract class C07_AbstractP extends C06_AbstractGP{
    /*
    abstract bir classın concrete childi parenti olan abstract classtaki tum abstract
    methodları implement etmek zorundadır

    Concrete olmyan yani abstract child classlar parent abstract classtaki abstract methodları
    implmenet etmeke zorunda degildir
    ayni sekilde parent classtaki concrete methodları implement etmek zorunda degildir

     */
    protected void method1(){
        System.out.println("parent class concrete method1");
    }

    protected void method4(){
        System.out.println("parent class concrete method4");
    }
    protected abstract void method5();
    protected void method6(){
        System.out.println("parent class conrete method6");
    }
}
