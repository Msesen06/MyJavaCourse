package day21_dateTime_varargs;

public class C07_varargs {
    public static void main(String[] args) {
        //verilen degisken sayidaki tamsayidan
        // ilkinin karesini digerlerinin toplamiyla carpan bir method olusturun

        islemYap(3,4,5); //3*3 *(4+5)
        islemYap(2,5,1,4);//2*2 * (5+1+4)
        islemYap(4);//varargs in degeri 0 olur
    }

    public static void islemYap(int ilkSayi ,int...geriyeKalan) {
       int toplam =0;
        for (int sayi :geriyeKalan
             ) {
            toplam+=sayi;
        }
        System.out.println("istenen sonuc: "+ilkSayi*ilkSayi*toplam);
    }

}
