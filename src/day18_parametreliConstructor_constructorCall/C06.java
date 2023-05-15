package day18_parametreliConstructor_constructorCall;

public class C06 {

    public C06(){
        System.out.println("Parametresiz Constructor");
    }

    C06(int sayi) {
        //C06(); Java method call kabul etti
        //bir constructor ismi  yazilarak cagrilamaz.

        this();// cosntructor call
        System.out.println("int Parametreli Constructor");
    }
    C06(String str){
        this(5);
        System.out.println("String parametreli cosntructor");
    }


    public static void main(String[] args) {
        C06 obj =new C06("Java");
    }
}
