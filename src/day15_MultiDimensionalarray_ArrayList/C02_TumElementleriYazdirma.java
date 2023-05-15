package day15_MultiDimensionalarray_ArrayList;

public class C02_TumElementleriYazdirma {
    public static void main(String[] args) {
        /*
        mda'da tum elemanlari yazdirmak icin kac katlı arrayse o kadar for loop kullanmaliyiz
         */
        int[][] arraylar={{1,2,5,46},{3,9,11,45},{23,34,22},{4,7,9,11}};
        for (int i = 0; i < arraylar.length; i++) {
            for (int j = 0; j < arraylar[i].length; j++) {
                System.out.print(arraylar[i][j]+" ");
            }
            System.out.print(",");
        }

        //tum elementleri toplayalım
        System.out.println("");
        int toplam =0;

        for (int i = 0; i < arraylar.length; i++) {
            for (int j = 0; j < arraylar[i].length; j++) {
                toplam+=arraylar[i][j];
            }

        }

        System.out.println("elementlerin toplamı :"+toplam);
    // MDA'daki elementlerin en buyugunu bulalım;

        int enBuyuk=arraylar[0][0];
        for (int i = 0; i < arraylar.length; i++) {
            for (int j = 0; j < arraylar[i].length; j++) {
                if (arraylar[i][j]>enBuyuk){
                    enBuyuk=arraylar[i][j];
                }
            }
        }
        System.out.println("elementlerin en buyugu:"+enBuyuk);
         // MDA'daki cift sayıları yanyana yadırın

        for (int i = 0; i < arraylar.length; i++) {
            for (int j = 0; j < arraylar[i].length; j++) {
                if (arraylar[i][j]%2==0){
                    System.out.print(arraylar[i][j]+" ");
                }
            }
        }

    }
}
