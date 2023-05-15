package day11_methodOverloading_WhileLopp;

public class C08_WhileLoop {
    public static void main(String[] args) {
      // while loop mu for loop mu cevabi yapacağimiz ise baglı
      // 1 'den 100 e kadar olan sayıları yazalım
        // dongu sayısı belli ise for loop
        // baslangic ve bitis degerleri belli degilse while loop kullanilmalidir.

        for (int i = 1; i <=100; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        int i=1;
        while (i<=100){
            System.out.print(i+" ");
            i++;
        }

    }
}
