package day09_StringManipulation_ForLoop;

public class C08_forLoopDikkatEdilecekler {
    public static void main(String[] args) {
        // verilen ilk deger bitis sartını saglamıyorsa for calısır ama body'si devreye girmez
        for (int i = 10; i <0 ; i++) {
            System.out.println("i :"+i);// hic birsey yazmaz
        }

        // baslangıc degeri ve artis/azalis miktari ile bitis sarti hic saglanmazsa
        for (int i = 10; i >=1 ; i++) {
            System.out.println(i); //  sonsuz loop olusur
        }


    }
}
