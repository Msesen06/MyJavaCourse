package day26_InheritanceDatatypeKullanimi_Overriding;

public class Overriding3 extends Overriding2{
    public void method1(){
        System.out.println("overridig3 method1");

    }

    @Override
    void method3() {
        super.method3();
    }
    /*
    Overriding methodu intelliJ de olusturtuabiliriz
    bu durumda 2 sey ekler
    1-@Override annaotation silersek CTE olmaz
      parentc classatki overriden methodu kontrol eder
      silinirse cte verir

    2-   super.method3(); mecburi degil
         bir classta hem overridden method
         hem overriding method calısmaz

         eger en guncel method ile birlikte
         parent classta gecersiz kılınan methodun da calsımasını
         istersek super.method3(); kullanabilriz

     */

    public static void main(String[] args) {
        Overriding3 obj1 =new Overriding3();
        obj1.method1();//overridig3 method1
        obj1.method2();//overriding2 method2

        Overriding2 obj2 =new Overriding3();
        obj2.method1();//overridig3 method1
        obj2.method2();//overriding2 method2

        Overriding1 obj3 =new Overriding3();
        obj3.method1();//overridig3 method1
        obj3.method2();//overriding2 method2

        Overriding1 obj4 =new Overriding1();
        obj4.method1();//overridig1 method1
        obj4.method2();//overriding1 method2
    }

}
