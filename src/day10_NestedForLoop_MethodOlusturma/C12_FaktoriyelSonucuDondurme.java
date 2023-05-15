package day10_NestedForLoop_MethodOlusturma;

public class C12_FaktoriyelSonucuDondurme {
    public static void main(String[] args) {
        //Soru verilen bir sayının faktoriyelini donduren bir method olusturun

        int sonuc =FaktoriyelDondurme(5);
        System.out.println(sonuc);
    }
    public static int FaktoriyelDondurme(int sayi){
         int faktoriyel =1;
        for (int i = 1; i <=sayi; i++) {
            faktoriyel*=i;
        }
        return faktoriyel;
    }
}
