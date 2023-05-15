package day09_StringManipulation_ForLoop;

public class C11_ForLoopAsalSayi {
    public static void main(String[] args) {
        //Soru :verilen bir sayının asal olup olmadıgını yazdırın
        int sayi=102;
        int sayac =0;
        for (int i = 1; i <= sayi; i++) {
            System.out.println("dene "+i);
            if (sayi%i==0){
                sayac++;
                break;
            }
        }

        if (sayac==2){
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal degildir");
        }




    }
}
