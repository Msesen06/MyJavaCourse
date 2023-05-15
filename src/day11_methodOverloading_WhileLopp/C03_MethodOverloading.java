package day11_methodOverloading_WhileLopp;

public class C03_MethodOverloading {
    public static void main(String[] args) {
        /*
        overloading asırı yukleme
        bir classta aynı isme sahip birden fazla methodun bulunmasıdır

        Javada bir class icerisinde aynı isim, aynı sayıda ve data turlerinde parametre ile
        bir method olusturulursa CTE verir. Compile Time Error
        bunun 3 cozumu var
        1- parametre sayısı degistirilebilir.
        2- parametrlerin data turu degisebilir
        3- farklı data turlerinin yerleri degistirilebilir.

        Java aynı isimdeki birden fazla method call yaptıgında hangisini
        calisacagini belirlemek icin argument-parametre uyumuna bakar.
         */
        topla('d','f');
        topla(2.4,5);
        topla(1,1.4);
    }
    public static void topla(int sayi1,int sayi2){
        System.out.println("iki int'in toplamı : "+(sayi1+sayi2));
    }

    public static void topla(int sayi1,int sayi2,int sayi3){
        System.out.println("uc int'in toplamı : "+(sayi1+sayi2));
    }
    public static void topla(char a,char b){
        System.out.println("iki char'in toplamı : "+a+b);
    }
    public static void topla(int sayi1,double sayi2){
        System.out.println("bir int'in ve bir double ın toplamı : "+(sayi1+sayi2));
    }
    public static void topla(double sayi1,int sayi2){
        System.out.println("bir double bir int'in toplamı : "+(sayi1+sayi2));
    }




}
