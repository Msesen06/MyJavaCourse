package day12_doWhile_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*  Soru 1
            ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

         */

        // do while ile yapımı
        char harf ='k';
        do {
            System.out.print(harf+"-");
            harf++;
        } while (harf<='t');

        System.out.println("");

        // while ile yapımı
        char harf2='k';
        while (harf2<='t'){
            System.out.print(harf2+"-");
            harf2++;
        }


        System.out.println("");
        // for ile yapımı

        for (char i ='k' ; i <='t'; i++) {
            System.out.print(i+"-");
        }

    }
}
