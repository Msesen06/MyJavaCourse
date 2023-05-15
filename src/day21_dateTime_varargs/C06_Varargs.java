package day21_dateTime_varargs;

public class C06_Varargs {
    public static void main(String[] args) {
        //iki tamsayiyi toplayip yazdiran bir method olusturun
        topla(4,5);
        topla(3,4,5);
        topla(1,4,6,4,3);
        topla(2,4,8,3,1,9,6,4);
    }

    public static void topla(int... sayilar) {
        int toplam =0;
        for (int sayi:sayilar
             ) {
            toplam+=sayi;
        }
        System.out.println("verilen "+sayilar.length+" elementin toplami :"+toplam);

        /*
        java da ... nokta olursa variable data turunun yanina 3 nokta konursa uzunlugu degisken
        olan bir array ifade eder

        variaty of argumnets
         */

    }


}
