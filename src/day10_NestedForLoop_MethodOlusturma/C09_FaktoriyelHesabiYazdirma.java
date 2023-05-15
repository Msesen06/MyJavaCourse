package day10_NestedForLoop_MethodOlusturma;

public class C09_FaktoriyelHesabiYazdirma {
    public static void main(String[] args) {
        /*
        verilen bir sayının faktoriyelini yazdıran bir method olusturun
         */

        faktoriyelHesapla(4);


    }

    public static void faktoriyelHesapla(int sayi){
        int faktoriyel =1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i;
        }
        System.out.println(sayi+"!= "+faktoriyel);
    }
}
