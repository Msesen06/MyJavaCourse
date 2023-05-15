package day10_NestedForLoop_MethodOlusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {
        // verilen iki sayiyi toplayan method olusturun

      ikiSayiToplama(4,9);
      ikiSayiToplama(3,77);
    }

    public static void ikiSayiToplama(int sayi1,int sayi2){
       /*
       public :access modifier ==> erisim belirleyici
       static : ozel bir keyword dur
       void : return type methodun bana birsey dondurmeyecegini sadece yazdıracagını ifade eder
       isim: yapilan bir isle baglantılı olmasını belirtir.
       paramatreler : methodun yapacagı isi yapması icin gereken değişkenler

        */
        System.out.println("iki sayının toplamı :"+(sayi1+sayi2));
    }
}
