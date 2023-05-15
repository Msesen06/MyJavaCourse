package day09_StringManipulation_ForLoop;

public class C10_forLoopFaktoriyel {
    public static void main(String[] args) {
        //soru verilen sayının faktoriyelini bulun
        int sayi =5;
        int faktoriyel =1;
        for (int i = 1; i <=sayi; i++) {
           faktoriyel*=i;
        }

        System.out.println(faktoriyel);
        //sonucu 5!=5*4*3*2*1=120 seklinde yazdırın
        faktoriyel=1;
        String sonuc =sayi+" != ";
        System.out.print(sonuc);
        for (int i = 1; i <=sayi; i++) {
            faktoriyel*=i;
            if (i!=5){
                System.out.print(i+" * ");
            } else {
                System.out.print("5=");
            }

        }
        System.out.print(faktoriyel);





    }
}
